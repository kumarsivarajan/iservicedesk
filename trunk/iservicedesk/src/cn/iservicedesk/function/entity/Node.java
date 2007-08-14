package cn.iservicedesk.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import cn.iservicedesk.infrastructure.LocalNamingEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity(name="NODE")
public class Node extends LocalNamingEntityObject {

    @Column(name="FUNCTION_URL")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
