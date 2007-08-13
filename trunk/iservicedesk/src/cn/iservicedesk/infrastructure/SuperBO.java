package cn.iservicedesk.infrastructure;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */

public abstract class SuperBO implements BusinessObject{

    @Resource
    private SessionContext sessionContext;

    protected SessionContext getSessionContext(){
        return sessionContext;
    }

    /**
     * 检查该EntityObject是否被引用
     *
     * @param entityObject entity
     */
    protected boolean isEntityReferenced(EntityObject entityObject){
        if(entityObject instanceof RefInspectableEntityObject) {
            return ((RefInspectableEntityObject)entityObject).isReferenced();
        }
        return false;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public boolean isVersionValid(VersionableEntityObject entity, String namedQuery) {
        VersionableEntityObject storedEntity = getDataAccessObject().getEntityObject(namedQuery,"ID",entity.getId());
        return storedEntity.getVersion() < entity.getVersion();
    }

    public abstract DataAccessObject getDataAccessObject();
}
