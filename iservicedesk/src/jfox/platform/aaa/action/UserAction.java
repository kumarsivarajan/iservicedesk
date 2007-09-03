package jfox.platform.aaa.action;

import jfox.platform.infrastructure.SuperAction;
import org.jfox.framework.annotation.Service;
import org.jfox.mvc.annotation.ActionMethod;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Service(id="user")
public class UserAction extends SuperAction {

    @ActionMethod(name="info", successView = "")
    public void getUserInfo() {

    }

}
