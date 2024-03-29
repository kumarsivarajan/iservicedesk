package jfox.platform.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jfox.platform.infrastructure.LocalNamingAndRefInspectableEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity
@Table(name="T_FUNC_MODULE")
public class Module extends LocalNamingAndRefInspectableEntityObject {

    @Column(name="BIND_ACTION")
    private String bindAction;

    @Column(name="ICON")
    private String icon;


    public String getBindAction() {
        return bindAction;
    }

    public void setBindAction(String bindAction) {
        this.bindAction = bindAction;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}