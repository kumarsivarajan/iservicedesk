package cn.iservicedesk.infrastructure;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public interface DataAccessObject extends org.jfox.entity.dao.DataAccessObject {

    /**
     * 根据 id 找到 Entity 对象
     *
     * @param sql             native sql
     * @param placeHolderName sql template column place holder name
     * @param id              id
     * @return entity instance
     */
    public <T extends EntityObject> T getEntityObject(String sql, String placeHolderName, long id);

    /**
     * 使用一个 sql query 语句进行查询，返回 entity list
     *
     * @param sql      native sql
     * @param paramMap parameter map
     */
    public <T extends EntityObject> List<T> processNativeQuery(String sql, Map<String, ?> paramMap);

    /**
     * 使用一个 hsql query 语句进行查询，返回 entity list
     *
     * @param sql         native sql
     * @param firstResult 第一个值的位置
     * @param maxResult   取值范围
     */
    public <T extends EntityObject> List<T> processNativeQuery(String sql, Map<String, ?> paramMap, int firstResult, int maxResult);

    public int executeNativeUpdate(String sql, Map<String, Object> paramMap);

    /**
     * 使用一个预定义的 query 语句进行查询，返回 entity list
     *
     * @param queryName named query
     */
    public <T extends EntityObject> List<T> processNamedQuery(String queryName, Map<String, ?> paramMap);

    /**
     * 使用一个预定义的 query 语句进行查询，返回 entity list
     *
     * @param queryName   named query
     * @param paramMap    parameter map
     * @param firstResult 第一个值的位置
     * @param maxResult   取值范围
     * @return 返回符合需要的 entity list
     */
    public <T extends EntityObject> List<T> processNamedQuery(String queryName, Map<String, ?> paramMap, int firstResult, int maxResult);


}
