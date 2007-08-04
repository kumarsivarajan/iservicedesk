package cn.iservicedesk.function.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import cn.iservicedesk.infrastructure.SuperDAO;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
public class FunctionDAOBean extends SuperDAO implements FunctionDAO{

}
