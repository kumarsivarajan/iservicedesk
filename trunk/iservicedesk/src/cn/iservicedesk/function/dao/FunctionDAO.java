package cn.iservicedesk.function.dao;

import cn.iservicedesk.infrastructure.DataAccessObject;
import cn.iservicedesk.function.entity.Function;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public interface FunctionDAO extends DataAccessObject {

    Function getFunctionById(long id);
}
