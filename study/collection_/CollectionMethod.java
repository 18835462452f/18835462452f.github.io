package senior.study.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author αυγή
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加元素
        list.add("tom");
        list.add(100);
        list.add(true);
        System.out.println("List=" + list);
        //删除指定元素
        list.remove(0);//按索引删除
        System.out.println("List=" + list);
        list.remove(true);//指定删除
        System.out.println("List=" + list);
        //查询是否存在元素
        System.out.println(list.contains(100));
        //查询元素个数
        System.out.println(list.size());
        //判断是否为空
        System.out.println(list.isEmpty());
        //清空
//        list.clear();
//        System.out.println("List=" + list);
        //添加多个元素
        ArrayList list1 = new ArrayList();
        list1.add("movies");
        list1.add(1000);
        list1.add('A');
        list.addAll(list1);
        System.out.println("List=" + list);
        //查找多个元素是否存在
        System.out.println(list.containsAll(list1));
        //删除多个元素
        list.removeAll(list1);
        System.out.println("List=" + list);

    }
}
