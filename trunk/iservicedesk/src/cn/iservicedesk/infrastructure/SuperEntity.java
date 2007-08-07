package cn.iservicedesk.infrastructure;

import javax.persistence.Id;
import javax.persistence.Column;

import org.jfox.entity.dao.PKGenerator;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public abstract class SuperEntity implements EntityObject, Comparable<SuperEntity>{
    /**
     * 每个表必须有ID字段，且作为 Primary Key
     */

    protected long id = -1;

    protected long createTime = System.currentTimeMillis();
    protected long lastModified = System.currentTimeMillis(); 
    protected boolean removed = false;

    public SuperEntity() {
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

    /**
     * 用来排序
     *
     * @param o entity to be compared
     */
    public int compareTo(SuperEntity o) {
        long thisId = this.getId();
        long thatId = o.getId();
        return (thisId < thatId ? -1 : (thisId == thatId ? 0 : 1));
    }

}
