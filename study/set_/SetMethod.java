package senior.study.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author αυγή
 */
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //Set接口的实现接口的对象 不能存放重复元素可以加入null，存放数据无序（添加顺序与取出顺序不一致）
        //取出顺序固定
        set.add("jonh");
        set.add("jack");
        set.add("jonh");
        set.add("lucky");
        set.add(null);
        set.add(null);

        System.out.println("set=" + set);
        //遍历：1.迭代器遍历  2.增强for  (不能通过索引遍历)
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("===================");
        for (Object o :set) {
            System.out.println(o);
        }

    }
}
