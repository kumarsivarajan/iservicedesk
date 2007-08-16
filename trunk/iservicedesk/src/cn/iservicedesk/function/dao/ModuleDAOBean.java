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
                query = "SELECT * FROM MODULE WHERE ID=$ID"
        )

                }
)
public class ModuleDAOBean extends SuperDAO implements ModuleDAO {

    public static final String GET_MODOULE_BY_ID = "getModuleById";

    public Module getModuleById(long id) {
        Map<String,Long> params = new HashMap<String, Long>(1);
        params.put("ID",id);
        return (Module)processNamedNativeQuery(GET_MODOULE_BY_ID, params);
    }
    
}
