package cn.iservicedesk.infrastructure;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.persistence.Column;

/**
 * 可以检查引用的 Entity
 * 采用 Property 格式，如：{ACCOUNT=1,2,3,4 USER=12,34,56}
 *
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public abstract class RefInspectableEntityObject extends EntityObject {
    // 是否已经初始化 refs
    private boolean refsInit = false;

    @Column(name = "REFS")
    protected String refs;

    private Map<String, List<Long>> refsMap = new HashMap<String, List<Long>>();

    public void setRefs(String refs) {
        this.refs = refs;
        //TODO: compute refs string 
    }

    public String getRefs() {
        //TODO: need to recompute refs string
        return refs;
    }

    public boolean isReferenced() {
        return !refsMap.isEmpty();
    }

    //TODO: 
    public synchronized void addReference(String tableName, long entityId) {
        if (!refsInit) {
            if (refs != null && refs.trim().length() > 0) {
                Properties refProperties = new Properties();
                try {
                    refProperties.load(new ByteArrayInputStream(refs.getBytes()));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                for(Map.Entry<Object, Object> entry : refProperties.entrySet()){
                    String tabName = entry.getKey().toString();
                    String value = entry.getValue().toString();
                    String[] refIds = value.split(",");
                    List<Long> refIdList = new ArrayList<Long>(refIds.length);
                    for(String refId : refIds){
                        refIdList.add(Long.parseLong(refId));
                    }
                    refsMap.put(tabName,refIdList);
                }
            }
            refsInit = true;

            List<Long> refIds = refsMap.get(tableName);
            if(refIds == null){
                refIds = new ArrayList<Long>(1);
            }
            refIds.add(entityId);
        }
    }

    public Long[] getReferenceIds(String key) {
        List<Long> refIds = refsMap.get(key);
        return refIds.toArray(new Long[refIds.size()]);
    }

    public static void main(String[] args) {

    }
}
