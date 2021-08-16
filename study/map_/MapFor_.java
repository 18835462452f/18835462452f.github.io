package senior.study.map_;

import java.util.*;

/**
 * @author αυγή
 */
@SuppressWarnings({"all"})
public class MapFor_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("001",1);
        map.put("002",2);
        map.put("003",3);
        map.put("004",4);
        //一.先取出所有的key 通过key取出value
        Set set = map.keySet();
        //1.增强for
        for (Object o :set) {
            System.out.println(o + "**" + map.get(o));
        }
        //2.迭代器
        System.out.println("============================");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + "**" + map.get(next));
        }
        //二.把所有的values取出
        System.out.println("============================");
        Collection values = map.values();
        //1.增强for
        for (Object o :values) {
            System.out.println(o);
        }
        //2.迭代器
        System.out.println("============================");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }
        //三.通过EntrySet取出k-v
        Set set1 = map.entrySet();
        //1.增强for
        System.out.println("============================");
        for (Object entry :set1) {
            //将entry转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"="+m.getValue());
        }
        //2.迭代器
        System.out.println("============================");
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            Map.Entry m1 = (Map.Entry) next;
            System.out.println(m1.getKey()+"="+m1.getValue());
        }


    }
}
