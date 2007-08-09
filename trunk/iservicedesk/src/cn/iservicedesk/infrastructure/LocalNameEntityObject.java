package cn.iservicedesk.infrastructure;

import java.util.Properties;
import java.util.Locale;
import java.io.ByteArrayInputStream;

/**
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public abstract class LocalNameEntityObject extends EntityObject{

    protected String name;
    //localName 多语言 properties 字符串
    protected String localName = "";
    private Properties localNameProperties = null;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getLocalName(Locale locale) {
        return getLocalName(locale.getDisplayName());
    }

    public String getLocalName(String localeName) {
        Properties localNameProperties = getLocalNameProperties();
        if (localNameProperties.contains(localeName)) {
            return localNameProperties.getProperty(localeName);
        }
        else {
            return getName();
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

}
