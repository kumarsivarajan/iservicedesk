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
    private long moduleId;

    @Column(name="IS_MENU")
    private int isMenu;

    @Column(name="NODE_GROUP")
    private String nodeGroup;

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

    public long getModuleId() {
        return moduleId;
    }

    public void setModuleId(long moduleId) {
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

    public String getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
