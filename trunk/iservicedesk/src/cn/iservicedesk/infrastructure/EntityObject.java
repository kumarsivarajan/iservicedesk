package cn.iservicedesk.infrastructure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

    /**
     * VALID STATUS, 数据有效状态
     * 0 正常
     * 1 DISABLED
     * 2 REMOVED
     */
    @Column(name="VSTATUS")
    protected int vstatus;


    @Column(name="DESCRIPTION")
    protected String description;

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

    public int getVstatus() {
        return vstatus;
    }

    public void setVstatus(int vstatus) {
        this.vstatus = vstatus;
    }

    public boolean isDisabled(){
        return getVstatus() == 1;
    }

    public boolean isRemoved(){
        return getVstatus() == 2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void increaseVersion(){
        this.version++;
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
     * @param thatEntity entity to be compared
     */
    public int compareTo(EntityObject thatEntity) {
        int comparePriority = new Integer(this.getPriority()).compareTo(thatEntity.getPriority());
        if(comparePriority == 0) {
            return new Long(this.getId()).compareTo(thatEntity.getId());
        }
        else {
            return comparePriority;
        }
    }

    /**
     * 根据 @Entity 得到 Table Name
     */
    public String getTableName() {
        Entity entity = this.getClass().getAnnotation(Entity.class);
        String tableName = entity.name();
        if(tableName == null || tableName.trim().length() == 0) {
            return "unknown";
        }
        else {
            return tableName;
        }
    }

}
