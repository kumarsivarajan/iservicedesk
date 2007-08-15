package cn.iservicedesk.infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;

import cn.iservicedesk.function.bo.NodeBO;
import cn.iservicedesk.function.entity.Node;
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
    public static final String THEME_KEY = "theme";
    public static final String LANG_KEY = "lang";

    @EJB
    NodeBO nodeBO;

    protected void preAction(InvocationContext invocationContext) {

        super.preAction(invocationContext);
    }

    protected void postAction(InvocationContext invocationContext) {
        SessionContext sessionContext = invocationContext.getSessionContext();
        // TODO: set default session

        // 设置主题
        String theme = (String)sessionContext.getAttribute(THEME_KEY);
        if(theme == null) {
            sessionContext.setAttribute(THEME_KEY, "VintageSugar");
        }
        sessionContext.setAttribute(LANG_KEY,"en_US");
        // 设置多语言
        String lang = (String)sessionContext.getAttribute(LANG_KEY);
        if (lang != null) {
            PageContext pageContext = invocationContext.getPageContext();
            pageContext.setTargetView(lang + "/" + pageContext.getTargeView());
        }

        if(invocationContext.getPageContext().hasBusinessException() || invocationContext.getPageContext().hasValidateException()) {
            // log action failed 
        }
        else {
            // log action successful
        }

        buildNodeGroups(invocationContext);
    }

    private void buildNodeGroups(InvocationContext invocationContext){
        PageContext pageContext = invocationContext.getPageContext();
        Map<String, List<Node>> nodeGroups = new HashMap<String, List<Node>>();
        // get nodeMap
        pageContext.setAttribute("_nodeGroups_", nodeGroups);

    }

    public static void main(String[] args) {

    }
}
