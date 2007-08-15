package cn.iservicedesk.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import cn.iservicedesk.infrastructure.LocalNamingAndRefInspectableEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity(name="NODE")
public class Node extends LocalNamingAndRefInspectableEntityObject {

    @Column(name="BIND_ACTION")
    private String bindAction;

    @Column(name="BIT_CODE")
    private int bitCode;

    @Column(name="PARENT_BIT_CODE")
    private int parentBitCode;

    @Column(name="MODULE_id")
    private int moduleId;

    @Column(name="IS_MENU")
    private int isMenu;

    @Column(name="DIV_GROUP")
    private String divGroup;

    @Column(name="ICON")
    private String icon;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
