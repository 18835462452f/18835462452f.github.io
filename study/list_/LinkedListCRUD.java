package senior.study.list_;

import java.util.LinkedList;

/**
 * @author αυγή
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        //删除结点
        //linkedList.remove();//默认删除第一个结点
        System.out.println(linkedList.remove());
        System.out.println("linkedList=" + linkedList);
        //修改节点
        linkedList.set(0,200);
        System.out.println("linkedList=" + linkedList);
        //获取指定结点对象
        Object o = linkedList.get(0);
        System.out.println(o);

    }
}
