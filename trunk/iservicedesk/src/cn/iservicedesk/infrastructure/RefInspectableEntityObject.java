package cn.iservicedesk.infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 可以检查引用的 Entity
 * 采用 Property 格式，如：{ACCOUNT=1,2,3,4 USER=12,34,56}
 *
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public abstract class RefInspectableEntityObject extends EntityObject{
    // 是否已经初始化 refs
    private boolean refsInit = false;

    protected String refs;

    private Map<String, List<String>> refsMap = new HashMap<String, List<String>>();

    public void setRefs(String refs) {
        this.refs = refs;
        //TODO: compute refs string 
    }

    public String getRefs(){
        //TODO: need to recompute refs string
        return refs;
    }

    public boolean isReferenced(){
        return !refsMap.isEmpty();
    }

    public String[] getReferenceIds(String key){
        List<String> refIds = refsMap.get(key);
        return refIds.toArray(new String[refIds.size()]);
    }

    public static void main(String[] args) {

    }
}
