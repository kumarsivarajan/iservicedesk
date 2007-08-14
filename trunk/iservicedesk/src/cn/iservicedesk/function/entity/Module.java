package cn.iservicedesk.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import cn.iservicedesk.infrastructure.LocalNamingAndRefInspectableEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity(name="MODULE")
public class Module extends LocalNamingAndRefInspectableEntityObject {

    @Column(name="BIND_ACTION")
    private String bindAction;

    @Column(name="BIT_CODE")
    private int bitCode;

    public String getBindAction() {
        return bindAction;
    }

    public void setBindAction(String bindAction) {
        this.bindAction = bindAction;
    }

    public int getBitCode() {
        return bitCode;
    }

    public void setBitCode(int bitCode) {
        this.bitCode = bitCode;
    }
}