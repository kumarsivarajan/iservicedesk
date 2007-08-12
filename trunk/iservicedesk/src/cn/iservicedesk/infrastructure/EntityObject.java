package cn.iservicedesk.infrastructure;

import javax.persistence.Id;
import javax.persistence.Column;

import org.jfox.entity.dao.PKGenerator;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class EntityObject implements Comparable<EntityObject>{
    /**
     * 每个表必须有ID字段，且作为 Primary Key
     */
    @Column(name="ID")
    protected long id = -1;

    @Column(name="CREATOR")
    protected String creator;

    @Column(name="CREATE_TIME")
    protected long createTime = System.currentTimeMillis();

    @Column(name="LAST_MODIFIER")
    protected String lastModifier;

    @Column(name="LAST_MODIFIED")
    protected long lastModified = System.currentTimeMillis();

    @Column(name="PRIORITY")
    protected int priority = 0;

    @Column(name="VERSION")
    protected int version;

    @Column(name="DISABLED")
    protected int disabled;

    @Column(name="REMOVED")
    protected boolean removed = false;

    public EntityObject() {
        // 使用PKgen生成id
        id = PKGenerator.getInstance(0).nextPK();
    }

    /**
     * 获得 Id，like: 2006121916471910560
     */
    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    /**
     * 设置删除标志
     *
     * @param removed remove status
     */
    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    @Column(name = "REMOVED")
    public boolean isRemoved() {
        return removed;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * 用来排序
     *
     * @param o entity to be compared
     */
    public int compareTo(EntityObject o) {
        long thisId = this.getId();
        long thatId = o.getId();
        return (thisId < thatId ? -1 : (thisId == thatId ? 0 : 1));
    }

    //TODO:
    public String getTableName() {
        return "";
    }

}
