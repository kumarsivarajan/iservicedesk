package jfox.platform.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import jfox.platform.infrastructure.EntityObject;
import org.json.JSONArray;
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

    public static String convertEntity(EntityObject entityObject){
        Map<String, Object> entityMap = entityObject.convertToMap();
        JSONObject jsonObject = new JSONObject(entityMap);
        return jsonObject.toString();
    }

    public static String convertEntities(Collection<? extends EntityObject> entities) {
        List<JSONObject> jsonObjects = new ArrayList<JSONObject>(entities.size());
        for(EntityObject entityObject : entities){
            JSONObject jsonObject = new JSONObject(entityObject.convertToMap());
            jsonObjects.add(jsonObject);
        }
        JSONArray jsonArray = new JSONArray(jsonObjects);
        return jsonArray.toString();
    }
    
    public static void main(String[] args) {

    }
}
