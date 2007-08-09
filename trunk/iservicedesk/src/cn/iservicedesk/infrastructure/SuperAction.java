package cn.iservicedesk.infrastructure;

import org.jfox.mvc.ActionSupport;
import org.jfox.mvc.InvocationContext;
import org.jfox.mvc.PageContext;
import org.jfox.mvc.SessionContext;

/**
 * 做日志记录、权限判断
 * <p/>
 * 所有 Action 从这里继承
 * <p/>
 * //TODO: 支持多语言 successView
 * //TODO: 支持 themes 选择
 * //TODO: 设置通用变量
 * //TODO: 检查新到消息
 *
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class SuperAction extends ActionSupport {

    protected void preAction(InvocationContext invocationContext) {

        super.preAction(invocationContext);
    }

    protected void postAction(InvocationContext invocationContext) {
        SessionContext sessionContext = invocationContext.getSessionContext();

        // 设置主题
        String theme = (String)sessionContext.getAttribute("theme");
        if(theme == null) {
            sessionContext.setAttribute("theme", "VintageSugar");
        }

        // 设置多语言
        String lang = (String)sessionContext.getAttribute("lang");
        if (lang != null) {
            PageContext pageContext = invocationContext.getPageContext();
            pageContext.setTargetView(lang + "/" + pageContext.getTargeView());
        }

        if(invocationContext.getPageContext().hasBusinessException() || invocationContext.getPageContext().hasValidateException()) {
            // log action failed 
        }
        else {
            // log action successful
        }
    }

    public static void main(String[] args) {

    }
}
