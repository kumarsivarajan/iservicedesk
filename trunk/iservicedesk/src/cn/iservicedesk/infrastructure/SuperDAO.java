package cn.iservicedesk.infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jfox.entity.dao.DAOSupport;
import org.jfox.entity.QueryExt;

/**
 * //TODO: 支持多数据库SQLTemplate
 *
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class SuperDAO extends DAOSupport implements DataAccessObject {
    
    /**
     * 注入 JPA EntityManager
     */
    @PersistenceContext(unitName = "iServiceDesk_DS")
    private EntityManager em = null;

    /**
     * 返回 EntityManager，默认注入的是 default
     */
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     * 根据 id 找到 Entity 对象
     *
     * @param namedQuery  named native sql
     * @param placeHolderName sql template column place holder name
     * @param id id
     * @return entity instance
     */
    public <T extends EntityObject> T getEntityObject(String namedQuery, String placeHolderName, long id) {
        Map<String, Long> paramMap = new HashMap<String, Long>(1);
        paramMap.put(placeHolderName,id);
        List<T> entities = processNamedNativeQuery(namedQuery,paramMap);
        if(!entities.isEmpty()) {
            return entities.get(0);
        }
        else {
            return null;
        }
    }


    public int executeNamedNativeUpdate(String sql, Map<String, Object> paramMap) {
        Query query = createNamedNativeQuery(sql);
        if (paramMap != null) {
            for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }
        return query.executeUpdate();
    }

    /**
     * 使用一个预定义的 query 语句进行查询，返回 entity list
     *
     * @param queryName   named query
     */
    public <T extends EntityObject> List<T> processNamedNativeQuery(String queryName, Map<String, ?> paramMap) {
        Query query = createNamedNativeQuery(queryName);
        if (paramMap != null) {
            for (Map.Entry<String, ?> entry : paramMap.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }
        return (List<T>)query.getResultList();
    }

    /**
     * 使用一个预定义的 query 语句进行查询，返回 entity list
     *
     * @param queryName   named query
     * @param paramMap parameter map
     * @param firstResult 第一个值的位置
     * @param maxResult 取值范围
     * @return 返回符合需要的 entity list
     */
    public <T extends EntityObject> List<T> processNamedNativeQuery(String queryName, Map<String, ?> paramMap, int firstResult, int maxResult) {
        Query query = createNamedNativeQuery(queryName);
        if (paramMap != null) {
            for (Map.Entry<String, ?> entry : paramMap.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResult);
        return (List<T>)query.getResultList();
    }

    public QueryExt createNativeQuery(String sql) {
        throw new UnsupportedOperationException("Can not create native query, only named native query supported!");
    }

    public QueryExt createNativeQuery(String sql, Class<?> resultClass) {
        throw new UnsupportedOperationException("Can not create native query, only named native query supported!");
    }
}
