package jfox.platform.function.dao;

import java.util.List;

import jfox.platform.function.entity.Node;
import jfox.platform.infrastructure.DataAccessObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public interface NodeDAO extends DataAccessObject {

    Node getNodeById(long id);

    Node getNodeByBindAction(String bindAction);

    List<Node> getMenuNodesByModuleId(long moduleId);

    List<Node> getAllNodes();

    void insertNode(Node node);

    List<Node> getNodesByModuleId(long moduleId);

    List<Node> getNodesByParentNodeId(long parentNodeId);
}
