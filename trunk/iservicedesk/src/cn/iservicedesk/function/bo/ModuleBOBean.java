package cn.iservicedesk.function.bo;

import javax.ejb.EJB;

import cn.iservicedesk.function.dao.ModuleDAO;
import cn.iservicedesk.function.entity.Module;

/**
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public class ModuleBOBean implements ModuleBO{

    @EJB
    ModuleDAO moduleDAO;

    public Module getModuleById(long moduleId) {
        return moduleDAO.getModuleById(moduleId);
    }

    public static void main(String[] args) {

    }
}
