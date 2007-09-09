package jfox.platform.common;

/**
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public class Constants {
    private static final Constants me = new Constants();

    public static final Object NULL = null;
    public static final String EMPTY_STRING = "";

    private Constants() {

    }

    public static Constants getInstance() {
        return me;
    }

    public static void main(String[] args) {

    }
}
