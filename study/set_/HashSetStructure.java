package senior.study.set_;

/**
 * @author αυγή
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //1.创建一个数组 类型为Node[]
        Node[] table = new Node[16];
        System.out.println("table=" + table);
        //创建节点
        Node jack = new Node("Jack", null);
        table[2] = jack;
        Node tom = new Node("Tom", null);
        jack.next = tom;//将tom结点挂载到jack
        Node rose = new Node("Rose", null);
        tom.next = rose;//将rose结点挂载到tom
        Node lucy = new Node("Lucy", null);
        table[3] = lucy;
        System.out.println("table=" + table);
    }
}
class Node {
    Object item;//存放数据
    Node next;//指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
