package cn.iservicedesk.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import cn.iservicedesk.infrastructure.LocalNamingEntityObject;
import cn.iservicedesk.infrastructure.LocalNamingAndRefInspectableEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity(name="NODE")
public class Node extends LocalNamingAndRefInspectableEntityObject {

    @Column(name="LINK_ACTION")
    private String linkAction;

    public String getLinkAction() {
        return linkAction;
    }

    public void setLinkAction(String linkAction) {
        this.linkAction = linkAction;
    }
}
