package cn.iservicedesk.function.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;

import cn.iservicedesk.function.entity.Node;
import cn.iservicedesk.infrastructure.SuperDAO;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
@NamedNativeQueries(
        {
        @NamedNativeQuery(
                name = NodeDAOBean.GET_NODE_BY_ID,
                query = "SELECT * FROM NODE WHERE ID=$ID",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.GET_ALL_NODES,
                query = "SELECT * FROM NODE",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        ),
        @NamedNativeQuery(
                name = NodeDAOBean.GET_MENUS_BY_MODULE_ID,
                query = "SELECT * FROM NODE WHERE MODULE_ID=$MODULE_ID AND IS_MENU=1",
                resultClass = Node.class
        )

                }
)

public class NodeDAOBean extends SuperDAO implements NodeDAO {
    public final static String GET_NODE_BY_ID = "getNodeById";
    public final static String GET_ALL_NODES = "getAllNodes";
    public final static String GET_MENUS_BY_MODULE_ID = "getMenusByModuleId";

    public Node getNodeById(long id) {
        return (Node)getEntityObject(NodeDAOBean.GET_NODE_BY_ID, "ID", id);
    }

    public List<Node> getAllFunctions() {
        return (List<Node>)createNamedNativeQuery(NodeDAOBean.GET_ALL_NODES).getResultList();
    }

    public List<Node> getMenusByModuleId(long moduleId){
        Map<String, Long> params = new HashMap<String, Long>(1);
        params.put("MODULE_ID",moduleId);
        return (List<Node>)processNamedNativeQuery(NodeDAOBean.GET_MENUS_BY_MODULE_ID,params);
    }

}
