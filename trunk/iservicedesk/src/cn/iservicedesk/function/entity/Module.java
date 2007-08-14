package cn.iservicedesk.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import cn.iservicedesk.infrastructure.LocalNamingEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity(name="MODULE")
public class Module extends LocalNamingEntityObject {

    @Column(name="BIND_ACTION")
    private String bindAction;

    private int bitCode;

    private int parentBitCode;

    private int moduleId;

    private int isMenu;

    private String divGroup;

    public String getBindAction() {
        return bindAction;
    }

    public void setBindAction(String bindAction) {
        this.bindAction = bindAction;
    }
}