package cn.iservicedesk.function.dao;

import java.util.List;
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
        @NamedNativeQuery(name = NodeDAOBean.GET_NODE_BY_ID,
                query = "SELECT * FROM NODE WHERE ID=$ID",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        ),
        @NamedNativeQuery(name = NodeDAOBean.GET_ALL_NODES,
                query = "SELECT * FROM SYS_FUNCTION",
                resultClass = Node.class,
                hints = {
                @QueryHint(name = "cache.partition", value = "function")
                        }
        )
                }
)

public class NodeDAOBean extends SuperDAO implements NodeDAO {
    public final static String GET_NODE_BY_ID = "getFunctionById";
    public final static String GET_ALL_NODES = "getAllFunctions";

    public Node getNodeById(long id) {
//        return (Function)createNamedNativeQuery(FunctionDAOBean.GET_FUNCTION_BY_ID).setParameter("ID", id).getSingleResult();
        return (Node)getEntityObject(NodeDAOBean.GET_NODE_BY_ID, "ID", id);

    }

    public List<Node> getAllFunctions() {
        return (List<Node>)createNamedNativeQuery(NodeDAOBean.GET_ALL_NODES).getResultList();
    }

}
