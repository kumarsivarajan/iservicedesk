package cn.iservicedesk.function.bo;

import cn.iservicedesk.function.entity.Module;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public interface ModuleBO {

    Module getModuleById(long moduleId);

    void createModule(Module module);
}
