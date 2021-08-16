package senior.study.list_;

/**
 * @author αυγή
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //双向链表
        Node jack = new Node("Jack");
        Node tom = new Node("Tom");
        Node mike = new Node("Mike");
        //链接三个结点形成双向链表
        jack.next = tom;
        tom.next = mike;
        mike.pre = tom;
        tom.pre = jack;

        Node first = jack;//first引用指向jack ，就是双向链表的头节点
        Node last = mike;//last引用指向mike，就是双向链表的尾节点

        //从头到尾遍历链表
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("========================");
        //从尾到头遍历
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        //添加对象/数据
        /*
        1.创建新的Node结点
        2.将插入数据指向前后数据 改变前后数据对新数据的指向
        3.让first再次指向 jack   反向遍历反之
         */
        Node smith = new Node("Smith");
        smith.next = mike;
        smith.pre = tom;
        mike.pre = smith;
        tom.next = smith;

        first = jack;
        System.out.println("***************************");
        //从头到尾遍历链表
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

    }
}
//定义Node类，Node对象表示双向链表的一个结点
class Node {
    public Object item;//真正存放数据
    public Node next;//指向下一个结点
    public Node pre;//指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
