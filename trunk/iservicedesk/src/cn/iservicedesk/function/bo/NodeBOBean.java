package cn.iservicedesk.function.bo;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import cn.iservicedesk.function.dao.NodeDAO;
import cn.iservicedesk.function.entity.Node;
import cn.iservicedesk.infrastructure.DataAccessObject;
import cn.iservicedesk.infrastructure.SuperBO;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
@Stateless
@Local
public class NodeBOBean extends SuperBO implements NodeBO {

    @EJB
    NodeDAO nodeDAO;

    public DataAccessObject getDataAccessObject() {
        return nodeDAO;
    }

    public Node getFunctionById(long id) {
        return nodeDAO.getNodeById(id);
    }

    public void addFunction(){
        
    }
}
