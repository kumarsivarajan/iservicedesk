package cn.iservicedesk.function.bo;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import cn.iservicedesk.function.dao.ModuleDAO;
import cn.iservicedesk.function.entity.Module;
import cn.iservicedesk.infrastructure.DataAccessObject;
import cn.iservicedesk.infrastructure.SuperBO;

/**
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
@Stateless
@Local
public class ModuleBOBean extends SuperBO implements ModuleBO{

    @EJB
    ModuleDAO moduleDAO;

    public DataAccessObject getDataAccessObject() {
        return moduleDAO;
    }

    public Module getModuleById(long moduleId) {
        return moduleDAO.getModuleById(moduleId);
    }

    public void createModule(Module module) {
        //getMaxBitCode
        int maxBitCode = moduleDAO.getMaxBitCode();
        module.setBitCode(++maxBitCode);
        moduleDAO.createModule(module);
    }

    public List<Module> getAllModules() {
        return moduleDAO.getAllModules();
    }
}
