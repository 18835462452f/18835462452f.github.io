package senior.study.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author αυγή
 */
public class TreeMap_ {
    public static void main(String[] args) {
        //使用无参构造器创建TreeMap 是无序的
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            //按照传入的k （String）的大小排序
            //按照k（String）长度排序
            public int compare(Object o1, Object o2) {
                //return ((String) o2).compareTo((String) o1);
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("smith", "史密斯");
        treeMap.put("mary", "玛丽");
        System.out.println(treeMap);
    }
}
