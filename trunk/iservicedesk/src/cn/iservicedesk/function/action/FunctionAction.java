package cn.iservicedesk.function.action;

import javax.ejb.EJB;

import cn.iservicedesk.function.bo.FunctionBO;
import cn.iservicedesk.function.entity.Function;
import cn.iservicedesk.infrastructure.SuperAction;
import org.jfox.framework.annotation.Service;
import org.jfox.mvc.Invocation;
import org.jfox.mvc.InvocationContext;
import org.jfox.mvc.PageContext;
import org.jfox.mvc.annotation.ActionMethod;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Service(id="function")
public class FunctionAction extends SuperAction {

    @EJB
    FunctionBO functionBO;

    @ActionMethod(name="new", successView = "function/newfunction.vhtml")
    public void newFunction(InvocationContext invocationContext) throws Exception {

    }

    @ActionMethod(name="add", successView = "function/listfunction.vhtml")
    public void addFunction(InvocationContext invocationContext) throws Exception {

    }

    @ActionMethod(name="get", successView = "function/viewFunction.vhtml", invocationClass = GetFunctionInvocation.class)
    public void getFunction(InvocationContext invocationContext) throws Exception{
        GetFunctionInvocation invocation = (GetFunctionInvocation)invocationContext.getInvocation();
        long functionId = invocation.getId();
        Function function = new Function();//functionBO.getFunctionById(functionId);
        function.setName("Add User");

        PageContext pageContext = invocationContext.getPageContext();
        pageContext.setAttribute("function", function);
    }

    public static class GetFunctionInvocation extends Invocation {

        private long id;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }

    public static class NewModuleInvocation extends GetFunctionInvocation {

    }

}