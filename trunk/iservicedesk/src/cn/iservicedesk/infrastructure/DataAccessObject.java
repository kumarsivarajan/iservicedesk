package cn.iservicedesk.infrastructure;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public interface DataAccessObject extends org.jfox.entity.dao.DataAccessObject {

    <T extends EntityObject> T getEntityObject(String namedQuery, String placeHolderName, long id);

    int executeNamedNativeUpdate(String sql, Map<String, Object> paramMap);

    <T extends EntityObject> List<T> processNamedNativeQuery(String queryName, Map<String, ?> paramMap);

    <T extends EntityObject> List<T> processNamedNativeQuery(String queryName, Map<String, ?> paramMap, int firstResult, int maxResult);
}
