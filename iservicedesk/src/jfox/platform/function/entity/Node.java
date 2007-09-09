package jfox.platform.function.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jfox.platform.infrastructure.LocalNamingAndRefInspectableEntityObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Entity
@Table(name="T_FUNC_NODE")
public class Node extends LocalNamingAndRefInspectableEntityObject {

    public static final int TYPE_MENU = 0;
    public static final int TYPE_BUTTON = 1;

    public static final int CRUD_C = 0;
    public static final int CRUD_R = 1;
    public static final int CRUD_U = 2;
    public static final int CRUD_D = 3;

    @Column(name="BIND_ACTION")
    private String bindAction;

    @Column(name="MODULE_ID")
    private long moduleId;

    @Column(name="PARENT_ID")
    private long parentId;

    @Column(name="NODE_GROUP")
    private String nodeGroup;

    @Column(name="ICON")
    private String icon;

    @Column(name="TYPE")
    private int type;

    @Column(name="CRUD")
    private int crud;

    public String getBindAction() {
        return bindAction;
    }

    public void setBindAction(String bindAction) {
        this.bindAction = bindAction;
    }

    public long getModuleId() {
        return moduleId;
    }

    public void setModuleId(long moduleId) {
        this.moduleId = moduleId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isMenu(){
        return getType() == TYPE_MENU;
    }

    public int getCrud() {
        return crud;
    }

    public void setCrud(int crud) {
        this.crud = crud;
    }
}
