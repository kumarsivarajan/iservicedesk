package cn.iservicedesk.function.action;

import cn.iservicedesk.infrastructure.SuperAction;
import org.jfox.framework.annotation.Service;
import org.jfox.mvc.Invocation;
import org.jfox.mvc.InvocationContext;
import org.jfox.mvc.annotation.ActionMethod;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Service(id="module")
public class ModuleAction extends SuperAction {

    @ActionMethod(name="new", successView = "function/newmodule.vhtml")
    public void newModule(InvocationContext invocationContext) throws Exception {

    }

    @ActionMethod(name="add", successView = "function/listmodule.vhtml")
    public void addModule(InvocationContext invocationContext) throws Exception {

    }
    public static class NewModuleInvocation extends Invocation {

    }
}
