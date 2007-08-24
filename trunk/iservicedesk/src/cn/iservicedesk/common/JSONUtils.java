package cn.iservicedesk.common;

import java.util.Map;

import cn.iservicedesk.infrastructure.EntityObject;
import org.json.JSONObject;

/**
 * @author <a href="mailto:jfox.young@gmail.com">Young Yang</a>
 */
public class JSONUtils {

    private final static JSONUtils me = new JSONUtils();

    private JSONUtils() {
    }

    public static JSONUtils getInstance(){
        return me;
    }

    public static String entityToJSONString(EntityObject entityObject){
        Map<String, Object> entityMap = entityObject.convertToMap();
        JSONObject jsonObject = new JSONObject(entityMap);
        return jsonObject.toString();
    }
    
    public static void main(String[] args) {

    }
}
