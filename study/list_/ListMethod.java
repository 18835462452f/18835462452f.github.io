package senior.study.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author αυγή
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("C");
        //1.指定索引插入元素
        list.add(1,"B");
        System.out.println(list);
        //2.指定索引处添加list1所有元素
        List list1 = new ArrayList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("A");
        list1.add("A");
        list.addAll(1,list1);
        System.out.println(list);
        //返回元素在集合中首次出现的位置
        System.out.println(list.indexOf("A"));
        //返回元素最后一次出现的位置
        System.out.println(list.lastIndexOf("A"));
        //移除指定索引处元素，返回此元素
        list.remove(1);
        System.out.println(list);
        //替换元素  有效索引
        list.set(0,"F");
        System.out.println(list);
        //返回指定起始索引的子集合   [start index,end index)
        List list2 = list.subList(0, 3);
        System.out.println(list2);
    }
}
