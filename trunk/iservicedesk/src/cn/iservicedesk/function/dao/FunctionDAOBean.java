package cn.iservicedesk.function.dao;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;

import cn.iservicedesk.function.entity.Function;
import cn.iservicedesk.infrastructure.SuperDAO;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
@NamedNativeQueries({

@NamedNativeQuery(name = FunctionDAOBean.GET_FUNCTION_BY_ID,
        query = "SELECT * FROM SYS_FUNCTION WHERE ID=$ID",
        resultClass = Function.class,
        hints = {
        @QueryHint(name = "jdbc.compatible", value = "mysql,sqlserver,oracle")
                }),

@NamedNativeQuery(name = FunctionDAOBean.GET_FUNCTION_BY_ID,
        query = "SELECT * FROM SYS_FUNCTION WHER ID=$ID",
        resultClass = Function.class,
        hints = {
        @QueryHint(name = "jdbc.compatible", value = "sybase"),
                @QueryHint(name = "cache.partition", value = "function")
                }),

@NamedNativeQuery(name = FunctionDAOBean.GET_ALL_FUNCTIONS,
        query = "SELECT * FROM SYS_FUNCTION",
        resultClass = Function.class,
        hints = {
                @QueryHint(name = "cache.partition", value = "function")
                })
        }
)
public class FunctionDAOBean extends SuperDAO implements FunctionDAO {
    public final static String GET_FUNCTION_BY_ID = "getFunctionById";
    public final static String GET_ALL_FUNCTIONS = "getAllFunctions";

    public Function getFunctionById(long id) {
//        return (Function)createNamedNativeQuery(FunctionDAOBean.GET_FUNCTION_BY_ID).setParameter("ID", id).getSingleResult();
        return (Function)getEntityObject(FunctionDAOBean.GET_FUNCTION_BY_ID,"ID",id);

    }

    public List<Function> getAllFunctions(){
        return (List<Function>)createNamedNativeQuery(FunctionDAOBean.GET_ALL_FUNCTIONS).getResultList();
    }

}
