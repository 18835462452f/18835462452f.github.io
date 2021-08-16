package senior.study.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author αυγή
 */
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("001","FJX");
        map.put("002","XXX");
        System.out.println(map);

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj :set) {
            //System.out.println(obj.getClass());
            //为了从HashMap$Node取出k-v
            //1.先做向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() +"*"+ entry.getValue());
        }

    }
}
