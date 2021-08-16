package senior.study.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author αυγή
 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("001",1);
        map.put("002",2);
        map.put("003",3);
        map.put("004",4);
        map.remove("004");
        System.out.println(map);
        Object o = map.get("001");
        System.out.println(o);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        //map.clear();
        //System.out.println(map);
        System.out.println(map.containsKey("123"));


    }
}
