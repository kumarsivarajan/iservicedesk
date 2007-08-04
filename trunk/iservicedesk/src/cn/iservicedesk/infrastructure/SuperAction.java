package cn.iservicedesk.infrastructure;

import org.jfox.mvc.ActionSupport;
import org.jfox.mvc.annotation.ActionMethod;

/**
 * 做日志记录、权限判断
 *
 * 所有 Action 从这里继承
 *
 * //TODO: 支持多语言 successView
 * //TODO: 支持 themes 选择
 *
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class SuperAction extends ActionSupport {

    public static void main(String[] args) {

    }
}
