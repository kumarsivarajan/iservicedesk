package cn.iservicedesk.function.bo;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import cn.iservicedesk.function.dao.FunctionDAO;
import cn.iservicedesk.infrastructure.SuperBO;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
public class FunctionBOBean extends SuperBO implements FunctionBO{

    @EJB
    FunctionDAO functionDAO;

    public void addFunction(){
        
    }
}