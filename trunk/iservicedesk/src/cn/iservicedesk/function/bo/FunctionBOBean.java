package cn.iservicedesk.function.bo;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import cn.iservicedesk.function.dao.FunctionDAO;
import cn.iservicedesk.function.entity.Function;
import cn.iservicedesk.infrastructure.SuperBO;
import cn.iservicedesk.infrastructure.DataAccessObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
public class FunctionBOBean extends SuperBO implements FunctionBO{

    @EJB
    FunctionDAO functionDAO;

    public DataAccessObject getDataAccessObject() {
        return functionDAO;
    }

    public Function getFunctionById(long id) {
        return functionDAO.getFunctionById(id);
    }

    public void addFunction(){
        
    }
}
