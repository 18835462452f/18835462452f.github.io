package senior.study.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author αυγή
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 15; i++) {
            list.add("Hello" + i);
        }
        System.out.println(list);
        list.add(1,"冯佳鑫");
        System.out.println(list);

        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);
        list.set(6,"Fjx");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
