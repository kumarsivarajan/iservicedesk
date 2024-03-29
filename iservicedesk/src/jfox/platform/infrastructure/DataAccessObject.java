package jfox.platform.infrastructure;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public interface DataAccessObject extends org.jfox.entity.dao.DataAccessObject {

    EntityObject getEntityObjectByColumn(String namedQuery, String placeHolderName, Object id);

    int executeNamedNativeUpdate(String sql, Map<String, Object> paramMap);

    List<? extends EntityObject> processNamedNativeQuery(String queryName, Map<String, ?> paramMap);

    List<? extends EntityObject> processNamedNativeQuery(String queryName, Map<String, ?> paramMap, int firstResult, int maxResult);
}
