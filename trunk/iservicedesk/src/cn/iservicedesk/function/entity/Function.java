package cn.iservicedesk.function.entity;

import java.util.Locale;
import java.util.Properties;
import java.io.StringReader;
import java.io.ByteArrayInputStream;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public class Function {

    private String name;
    //localName 多语言 properties 字符串
    private String localName = "";
    private Properties localNameProperties = null;

    public String getLocalName(Locale locale) {
        return getLocalName(locale.getDisplayName());
    }

    public String getLocalName(String localeName) {
        Properties localNameProperties = getLocalNameProperties();
        if (localNameProperties.contains(localeName)) {
            return localNameProperties.getProperty(localeName);
        }
        else {
            return name;
        }
    }

    private Properties getLocalNameProperties() {
        if (localNameProperties == null) {
            localNameProperties = new Properties();
            try {
                localNameProperties.load(new ByteArrayInputStream(localName.getBytes()));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return localNameProperties;
    }

    public static void main(String[] args) {

    }
}
