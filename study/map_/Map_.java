package senior.study.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author αυγή
 */
public class Map_ {
    public static void main(String[] args) {
        //Map用于保存具有映射关系的数据 ：Key-Value(双列元素)
        Map map = new HashMap();
        map.put("No.1","Fjx");
        map.put("No.2","Tom");
        map.put("No.3","Smith");
        map.put("No.3","Mary");//相同Key 等价于替换
        map.put("No.4","Tom");//value可以有相同值
        //key value可以为空  key只能有一个null  value可以为多个null
        map.put(null,null);
        map.put(null,"abc");
        map.put("No.5",null);
        map.put("No.6",null);
        map.put("No.7",null);
        //常用String做为Key
        map.put(1,2);
        map.put(new Object(),2021);
        System.out.println(map);
        //通过get方法传入一个key  会返回对应的value
        System.out.println(map.get("No.1"));
    }
}
