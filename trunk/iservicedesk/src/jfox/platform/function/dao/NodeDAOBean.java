package jfox.platform.function.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;

import jfox.platform.function.entity.Node;
import jfox.platform.infrastructure.SuperDAO;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
@NamedNativeQueries(
        {
        @NamedNativeQuery(
                name = NodeDAOBean.GET_NODE_BY_ID,
                query = "SELECT * FROM T_FUNC_NODE WHERE ID=$ID",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.GET_NODE_BY_BIND_ACTION,
                query = "SELECT * FROM T_FUNC_NODE WHERE BIND_ACTION=$BIND_ACTION",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        ),

        @NamedNativeQuery(
                name = NodeDAOBean.GET_ALL_NODES,
                query = "SELECT * FROM T_FUNC_NODE",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.GET_NODES_BY_MODULE_ID,
                query = "SELECT * FROM T_FUNC_NODE WHERE MODULE_ID=$MODULE_ID ORDER BY ID",
                resultClass = Node.class
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.GET_MENU_NODES_BY_MODULE_ID,
                query = "SELECT * FROM T_FUNC_NODE WHERE MODULE_ID=$MODULE_ID AND TYPE=0 ORDER BY ID",
                resultClass = Node.class
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.GET_NODES_BY_PARENT_ID,
                query = "SELECT * FROM T_FUNC_NODE WHERE PARENT_ID=$PARENT_ID AND TYPE=0 ORDER BY ID",
                resultClass = Node.class
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.INSERT_NODE,
                query = "INSERT INTO T_FUNC_NODE(" +
                        "ID," +
                        "NAME, " +
                        "LOCAL_NAME, " +
                        "PRIORITY, " +
                        "CREATE_TIME, " +
                        "CREATOR, " +
                        "LAST_MODIFIED, " +
                        "LAST_MODIFIER, " +
                        "VSTATUS, " +
                        "DESCRIPTION, " +
                        "REFS, " +
                        "PARENT_ID," +
                        "BIND_ACTION, " +
                        "TYPE," +
                        "MODULE_ID," +
                        "MENU," +
                        "NODE_GROUP," +
                        "ICON) " +
                        "VALUES (" +
                        "$NODE.getId()," +
                        "$NODE.getName()," +
                        "$NODE.getLocalName()," +
                        "$NODE.getPriority()," +
                        "$NODE.getCreateTime()," +
                        "$NODE.getCreator()," +
                        "$NODE.getLastModified()," +
                        "$NODE.getLastModifier()," +
                        "$NODE.getVstatus()," +
                        "$NODE.getDescription()," +
                        "$NODE.getRefs()," +
                        "$NODE.getParentId()," +
                        "$NODE.getBindAction()," +
                        "$NODE.getType(),"+
                        "$NODE.getModuleId(),"+
                        "$NODE.getMenu(),"+
                        "$NODE.getNodeGroup(),"+
                        "$NODE.getIcon())"
        )

                }
)
public class NodeDAOBean extends SuperDAO implements NodeDAO {
    public final static String GET_NODE_BY_ID = "getNodeById";
    public final static String GET_NODE_BY_BIND_ACTION = "getNodeByBindAction";
    public final static String GET_ALL_NODES = "getAllNodes";
    public final static String GET_MENU_NODES_BY_MODULE_ID = "getMenuNodesByModuleId";
    public final static String GET_NODES_BY_MODULE_ID = "getNodesByModuleId";
    public final static String GET_NODES_BY_PARENT_ID = "getChildNodes";
    public final static String INSERT_NODE = "insertNode";

    public Node getNodeById(long id) {
        return (Node)getEntityObjectByColumn(NodeDAOBean.GET_NODE_BY_ID, "ID", id);
    }

    public Node getNodeByBindAction(String bindAction) {
        return (Node)getEntityObjectByColumn(NodeDAOBean.GET_NODE_BY_BIND_ACTION, "BIND_ACTION", bindAction);
    }

    public List<Node> getMenuNodesByModuleId(long moduleId) {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("MODULE_ID", moduleId);
        return (List<Node>)processNamedNativeQuery(NodeDAOBean.GET_MENU_NODES_BY_MODULE_ID, params);
    }

    public List<Node> getAllNodes() {
        return (List<Node>)processNamedNativeQuery(NodeDAOBean.GET_ALL_NODES, Collections.EMPTY_MAP);
    }

    public void insertNode(Node node){
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("NODE", node);
        executeNamedNativeUpdate(INSERT_NODE, params);
    }

    public List<Node> getNodesByModuleId(long moduleId) {
        Map<String, Long> params = new HashMap<String, Long>(1);
        params.put("MODULE_ID", moduleId);
        return (List<Node>)processNamedNativeQuery(NodeDAOBean.GET_NODES_BY_MODULE_ID, params);
    }


    public List<Node> getNodesByParentNodeId(long parentNodeId) {
        Map<String, Long> params = new HashMap<String, Long>(1);
        params.put("PARENT_ID", parentNodeId);
        return (List<Node>)processNamedNativeQuery(NodeDAOBean.GET_NODES_BY_PARENT_ID, params);
    }

}
