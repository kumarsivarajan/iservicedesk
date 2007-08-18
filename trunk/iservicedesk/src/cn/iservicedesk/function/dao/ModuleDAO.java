package cn.iservicedesk.function.dao;

import cn.iservicedesk.function.entity.Module;
import cn.iservicedesk.infrastructure.DataAccessObject;

/**
 * @author <a href="mailto:yang_y@sysnet.com.cn">Young Yang</a>
 */
public interface ModuleDAO extends DataAccessObject {

    Module getModuleById(long id);

    void createModule(Module module);

    int getMaxBitCode();
}
