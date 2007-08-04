package cn.iservicedesk.function.action;

import cn.iservicedesk.infrastructure.SuperAction;
import org.jfox.framework.annotation.Service;
import org.jfox.mvc.Invocation;
import org.jfox.mvc.InvocationContext;
import org.jfox.mvc.annotation.ActionMethod;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Service(id="function")
public class FunctionAction extends SuperAction {

    @ActionMethod(name="new", successView = "function/newfunction.vhtml")
    public void newFunction(InvocationContext invocationContext) throws Exception {

    }

    @ActionMethod(name="add", successView = "function/listfunction.vhtml")
    public void addFunction(InvocationContext invocationContext) throws Exception {

    }

    public static class NewModuleInvocation extends Invocation {

    }
}