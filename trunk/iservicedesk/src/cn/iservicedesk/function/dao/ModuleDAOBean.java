package cn.iservicedesk.function.dao;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import cn.iservicedesk.function.entity.Module;
import cn.iservicedesk.infrastructure.SuperDAO;

/**
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
@Stateless
@Local
@NamedNativeQueries(
        {
        @NamedNativeQuery(
                name = ModuleDAOBean.GET_MODOULE_BY_ID,
                query = "SELECT * FROM FUNC_MODULE WHERE ID=$ID"
        ),
        @NamedNativeQuery(
                name = ModuleDAOBean.CREATE_MODULE,
                query = "INSERT INTO FUNC_MODULE(" +
                        "ID," +
                        "NAME, " +
                        "LOCAL_NAME, " +
                        "PRIORITY, " +
                        "CREATE_TIME, " +
                        "CREATOR, " +
                        "LAST_MODIFIED, " +
                        "LAST_MODIFIER, " +
                        "VSTATUS, " +
                        "DESCRIPTION, " +
                        "REFS, " +
                        "BIT_CODE, " +
                        "BIND_ACTION, " +
                        "ICON) " +
                        "VALUES (" +
                        "$module.getId()," +
                        "$module.getName()," +
                        "$module.getLocalName()," +
                        "$module.getPriority()," +
                        "$module.getCreateTime()," +
                        "$module.getCreator()," +
                        "$module.getLastModified()," +
                        "$module.getLastModifier()," +
                        "$module.getVstatus()," +
                        "$module.getDescription()," +
                        "$module.getRefs()," +
                        "$module.getBitCode()," +
                        "$module.getBindAction()," +
                        "$module.getIcon())"
        ),
        @NamedNativeQuery(
                name = ModuleDAOBean.GET_MAX_BITCODE,
                query = "SELECT MAX(BIT_CODE) FROM FUNC_MODULE",
                resultClass = Integer.class
        )
                }
)
public class ModuleDAOBean extends SuperDAO implements ModuleDAO {

    public static final String GET_MODOULE_BY_ID = "getModuleById";
    public final static String CREATE_MODULE = "createModule";
    public final static String GET_MAX_BITCODE = "getMaxModuleBitCode";

    public Module getModuleById(long id) {
        Map<String,Long> params = new HashMap<String, Long>(1);
        params.put("ID",id);
        return (Module)processNamedNativeQuery(GET_MODOULE_BY_ID, params);
    }

    public void createModule(Module module) {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("module", module);
        executeNamedNativeUpdate(CREATE_MODULE, params);
    }

    public int getMaxBitCode(){
        Integer maxBitCode =  (Integer)createNamedNativeQuery(GET_MAX_BITCODE).getSingleResult();
        if(maxBitCode == null) {
            return 0;
        }
        else {
            return maxBitCode;
        }
    }
    
}
