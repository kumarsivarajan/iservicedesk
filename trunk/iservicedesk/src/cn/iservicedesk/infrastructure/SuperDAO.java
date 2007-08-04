package cn.iservicedesk.infrastructure;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jfox.entity.dao.DAOSupport;

/**
 * //TODO: 支持多数据库SQLTemplate
 *
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class SuperDAO extends DAOSupport implements DataAccessObject{
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

}
