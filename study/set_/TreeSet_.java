package senior.study.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author αυγή
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //使用无参构造创建TreeSet 仍然是无序的
        //TreeSet treeSet = new TreeSet();
        //添加数据
        //使用TreeSet提供的构造器，传入一个比较器（匿名内部类）
        //指定排序规则
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的compareTo方法进行字符串大小比较
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("mary");
        treeSet.add("smith");
        System.out.println(treeSet);
        //

    }
}
