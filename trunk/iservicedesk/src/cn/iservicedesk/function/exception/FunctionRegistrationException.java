package cn.iservicedesk.function.exception;

import cn.iservicedesk.infrastructure.BusinessException;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public class FunctionRegistrationException extends BusinessException {

    public FunctionRegistrationException(String msg) {
        super(msg);
    }

    public FunctionRegistrationException(Exception e) {
        super(e);
    }

    public FunctionRegistrationException(String msg, Exception e) {
        super(msg, e);
    }

    public static void main(String[] args) {

    }
}
