package cn.iservicedesk.infrastructure;

import javax.annotation.Resource;
import javax.ejb.SessionContext;

import org.jfox.entity.EntityFactory;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */

public abstract class SuperBO implements BusinessObject{

    @Resource
    private SessionContext sessionContext;

    protected SessionContext getSessionContext(){
        return sessionContext;
    }

    protected EntityObject newEntity(Class<? extends EntityObject> entityClass){
        return EntityFactory.newEntityObject(entityClass);
    }
}
