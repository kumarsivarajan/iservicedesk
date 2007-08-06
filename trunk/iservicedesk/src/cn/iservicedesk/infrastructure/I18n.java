package cn.iservicedesk.infrastructure;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public class I18n {

    public static void main(String[] args) {
        ResourceBundle enBundle = ResourceBundle.getBundle("iservicedesk", Locale.US);
        ResourceBundle cnBundle = ResourceBundle.getBundle("iservicedesk", Locale.SIMPLIFIED_CHINESE);

        System.out.println(enBundle.getString("a"));
        System.out.println(enBundle.getString("b"));

        System.out.println(cnBundle.getString("a"));
        System.out.println(cnBundle.getString("b"));

    }

}
