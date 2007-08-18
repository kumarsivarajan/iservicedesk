package cn.iservicedesk.function.action;

import cn.iservicedesk.infrastructure.SuperAction;
import org.jfox.framework.annotation.Service;
import org.jfox.mvc.Invocation;
import org.jfox.mvc.InvocationContext;
import org.jfox.mvc.annotation.ActionMethod;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Service(id="module")
public class ModuleAction extends SuperAction {

    @ActionMethod(name="newview", successView = "function/new_module.vhtml")
    public void newViewModule(InvocationContext invocationContext) throws Exception {

        
    }

    @ActionMethod(name="new", successView = "function/new_module.vhtml", invocationClass = NewModuleInvocation.class)
    public void newModule(InvocationContext invocationContext) throws Exception {
        System.out.println("1234");
        NewModuleInvocation invocation = (NewModuleInvocation)invocationContext.getInvocation();
    }
    
    public static class NewModuleInvocation extends Invocation {
        private String name;
        private String localName_en_US;
        private String localName_zh_CN;
        private String localName_zh_TW;

        private String bindAction;
        private String icon;
        private int priority;
        private int vstatus;

        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocalName_en_US() {
            return localName_en_US;
        }

        public void setLocalName_en_US(String localName_en_US) {
            this.localName_en_US = localName_en_US;
        }

        public String getLocalName_zh_CN() {
            return localName_zh_CN;
        }

        public void setLocalName_zh_CN(String localName_zh_CN) {
            this.localName_zh_CN = localName_zh_CN;
        }

        public String getLocalName_zh_TW() {
            return localName_zh_TW;
        }

        public void setLocalName_zh_TW(String localName_zh_TW) {
            this.localName_zh_TW = localName_zh_TW;
        }

        public String getBindAction() {
            return bindAction;
        }

        public void setBindAction(String bindAction) {
            this.bindAction = bindAction;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getVstatus() {
            return vstatus;
        }

        public void setVstatus(int vstatus) {
            this.vstatus = vstatus;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
