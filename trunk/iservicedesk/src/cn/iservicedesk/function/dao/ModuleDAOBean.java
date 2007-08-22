package cn.iservicedesk.function.dao;

import java.util.HashMap;
import java.util.List;
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
                query = "SELECT * FROM T_FUNC_MODULE WHERE ID=$ID",
                resultClass = Module.class
        ),
        @NamedNativeQuery(
                name = ModuleDAOBean.GET_ALL_MODOULES,
                query = "SELECT * FROM T_FUNC_MODULE WHERE VSTATUS=0",
                resultClass = Module.class
        ),
        @NamedNativeQuery(
                name = ModuleDAOBean.CREATE_MODULE,
                query = "INSERT INTO T_FUNC_MODULE(" +
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
                        "$module.getBindAction()," +
                        "$module.getIcon())"
        )
                }
)
public class ModuleDAOBean extends SuperDAO implements ModuleDAO {

    public static final String GET_MODOULE_BY_ID = "getModuleById";
    public static final String GET_ALL_MODOULES = "getAllModules";
    public final static String CREATE_MODULE = "createModule";

    public Module getModuleById(long id) {
        return (Module)getEntityObject(GET_MODOULE_BY_ID, "ID", id);
    }

    public void createModule(Module module) {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("module", module);
        executeNamedNativeUpdate(CREATE_MODULE, params);
    }

    public List<Module> getAllModules() {
        return (List<Module>)processNamedNativeQuery(GET_ALL_MODOULES, null);
    }
}
