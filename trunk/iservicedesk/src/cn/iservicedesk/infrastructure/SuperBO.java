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

    /**
     * 检查该EntityObject是否被引用
     * @param entityObject entity
     */
    protected boolean inspectReference(EntityObject entityObject){
        return true;
    }

    public abstract SuperDAO getDataAccessObject();
}
