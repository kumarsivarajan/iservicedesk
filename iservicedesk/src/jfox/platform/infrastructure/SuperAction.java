package jfox.platform.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;

import jfox.platform.common.Constants;
import jfox.platform.common.JSONUtils;
import jfox.platform.function.bo.ModuleBO;
import jfox.platform.function.bo.NodeBO;
import jfox.platform.function.entity.Module;
import jfox.platform.function.entity.Node;
import org.jfox.mvc.ActionSupport;
import org.jfox.mvc.InvocationContext;
import org.jfox.mvc.PageContext;
import org.jfox.mvc.SessionContext;

/**
 * 做日志记录、权限判断
 * <p/>
 * 所有 Action 从这里继承
 * <p/>
 * //TODO: 支持多语言 successView
 * //TODO: 支持 themes 选择
 * //TODO: 设置通用变量
 * //TODO: 检查新到消息
 *
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class SuperAction extends ActionSupport {
    public static final String THEME_KEY = "themes";
    public static final String LANG_KEY = "lang";

    @EJB
    NodeBO nodeBO;
    @EJB
    ModuleBO moduleBO;

    private Module currentModule;
    private Node currentNode;

    //TODO: user nodeComparator 来对左菜单排序
    static Comparator<Node> nodeComparator = new Comparator<Node>() {
        public int compare(Node node1, Node node2) {
            if(node1.getParentId() == node2.getParentId()) {
                return Long.valueOf(node1.getId()).compareTo(node2.getId());
            }
            else if(node1.getParentId() != 0 && node2.getParentId() != 0){
                return Long.valueOf(node1.getParentId()).compareTo(node2.getParentId());
            }
            else if(node1.getParentId() == 0 && node2.getParentId() != 0){
                return Long.valueOf(node1.getId()).compareTo(node2.getParentId());
            }
            else if(node1.getParentId() != 0 && node2.getParentId() == 0){
                return Long.valueOf(node1.getParentId()).compareTo(node1.getId());
            }
            else {
                return 0;
            }

        }
    };

    protected void preAction(InvocationContext invocationContext) {
        super.preAction(invocationContext);

        PageContext pageContext = invocationContext.getPageContext();
        // set common attribute
        pageContext.setAttribute("J_JSONUTILS", JSONUtils.getInstance());
        pageContext.setAttribute("J_CONSTANTS", Constants.getInstance());

        // init current Node & Module
        initCurrent(invocationContext);

        List<Module> allModules = moduleBO.getAllModules();
        pageContext.setAttribute("J_ALL_MODULES", allModules);
        pageContext.setAttribute("J_CURRENT_MODULE", currentModule);
        pageContext.setAttribute("J_CURRENT_NODE", currentNode);
    }

    protected void initCurrent(InvocationContext invocationContext) {
        String actionMethodName = invocationContext.getFullActionMethodName();
        currentNode = nodeBO.getNodeByBindAction(actionMethodName);
        currentModule = moduleBO.getModuleById(currentNode.getModuleId());
        buildContextNodes(invocationContext);
    }

    /**
     * 根据上下文获得页面上的按钮，以及左边菜单
     */
    private void buildContextNodes(InvocationContext invocationContext) {
        PageContext pageContext = invocationContext.getPageContext();

        Map<String, List<Node>> nodeGroups = new HashMap<String, List<Node>>();

        // menuNodes in current Module
        List<Node> topLevelNodes = new ArrayList<Node>();
        Map<Long, List<Node>> parentMenuNodeGroups = new HashMap<Long, List<Node>>();

        List<Node> menuNodes = nodeBO.getMenuNodesByModuleId(currentModule.getId());

        Collections.sort(menuNodes, nodeComparator);

/*
        if (menuNodes != null && !menuNodes.isEmpty()) {
            for (Node node : menuNodes) {
                long parentId = node.getParentId();
                if (parentId == 0) {
                    topLevelNodes.add(node);
                }
                else {
                    if (!parentMenuNodeGroups.containsKey(parentId)) {
                        List<Node> menuNodesByParent = new ArrayList<Node>();
                        parentMenuNodeGroups.put(parentId, menuNodesByParent);
                    }
                    parentMenuNodeGroups.get(parentId).add(node);
                }
            }
        }

        List<Node> resortedMenuNodes = new ArrayList<Node>();
        for (Node node : topLevelNodes) {
            resortedMenuNodes.add(node);
            if (parentMenuNodeGroups.containsKey(node.getId())) {
                resortedMenuNodes.addAll(parentMenuNodeGroups.get(node.getId()));
            }
        }
*/

        // child nodes in current node
        List<Node> childrenNodes = nodeBO.getChildrenNodes(currentNode.getId());
        if (childrenNodes != null && !childrenNodes.isEmpty()) {
            for (Node node : childrenNodes) {
                String nodeGroup = node.getNodeGroup();
                if (!nodeGroups.containsKey(nodeGroup)) {
                    List<Node> nodes = new ArrayList<Node>();
                    nodeGroups.put(nodeGroup, nodes);
                }
                nodeGroups.get(nodeGroup).add(node);
            }
        }

        pageContext.setAttribute("J_MENU_NODES", menuNodes);
        // get buttonNodes
        pageContext.setAttribute("J_BUTTON_NODE_GROUPS", nodeGroups);
    }

    protected void postAction(InvocationContext invocationContext) {
        SessionContext sessionContext = invocationContext.getSessionContext();
        PageContext pageContext = invocationContext.getPageContext();
        // TODO: set default session

        // 设置主题
        String theme = (String)sessionContext.getAttribute(THEME_KEY);
        if (theme == null) {
            sessionContext.setAttribute(THEME_KEY, "VintageSugar");
        }
        sessionContext.setAttribute(LANG_KEY, "zh_CN");
        // 设置多语言
        String lang = (String)sessionContext.getAttribute(LANG_KEY);

        if (lang != null) {
            pageContext.setTargetView(lang + "/" + pageContext.getTargeView());
        }


        if (pageContext.hasBusinessException() || invocationContext.getPageContext().hasValidateException()) {
            // log action failed
        }
        else {
            // log action successful
        }

        //TODO: uncomment
//        buildContextNodes(invocationContext);

    }

    /**
     * 调用的节点
     */
    protected Node getCurrentNode() {
        return currentNode;
    }

    /**
     * 调用所在的模块
     */
    protected Module getCurrentModule() {
        return currentModule;
    }

    public static void main(String[] args) {

    }
}
