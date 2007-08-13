package cn.iservicedesk.infrastructure;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Properties;
import javax.persistence.Column;

/**
 * 支持多语言的 EntityObject，如：Function, Module
 *
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public abstract class VersionableEntityObject extends EntityObject{

    @Column(name="VERSION")
    private int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void increaseVersion(){
        this.version++;
    }

}