package cn.iservicedesk.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import cn.iservicedesk.infrastructure.LocalNamingEntityObject;
import cn.iservicedesk.infrastructure.LocalNamingAndRefInspectableEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity(name="MODULE")
public class Module extends LocalNamingAndRefInspectableEntityObject {

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

    public int getBitCode() {
        return bitCode;
    }

    public void setBitCode(int bitCode) {
        this.bitCode = bitCode;
    }

    public int getParentBitCode() {
        return parentBitCode;
    }

    public void setParentBitCode(int parentBitCode) {
        this.parentBitCode = parentBitCode;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getMenu() {
        return isMenu;
    }

    public void setMenu(int menu) {
        isMenu = menu;
    }

    public boolean isMenu(){
        return isMenu == 1;
    }

    public String getDivGroup() {
        return divGroup;
    }

    public void setDivGroup(String divGroup) {
        this.divGroup = divGroup;
    }
}