package senior.study.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author αυγή
 */
public class List_ {
    public static void main(String[] args) {
        //1.List集合元素有序（添加顺序与取出顺序一致），可重复
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
        list.add("A");
        System.out.println(list);
        //2.List集合中每个元素都有对应索引，可以按索引取出  0-n
        System.out.println(list.get(6));
        //3.List接口实现的类有 ArrayList LinkedList Vector

    }
}
