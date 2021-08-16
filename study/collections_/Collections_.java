package senior.study.collections_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author αυγή
 */
public class Collections_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("cc");
        list.add("DDDDD");
        list.add("EEE");
        //元素反转
        Collections.reverse(list);
        System.out.println(list);
        //随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //根据元素的自然顺序对指定List 升序排序
        Collections.sort(list);
        System.out.println(list);
        //指定排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println(list);

        //指定位置交换
        Collections.swap(list,0,1);
        System.out.println(list);
        //集合中的最大元素
        System.out.println(Collections.max(list));
        //返回长度最大的元素
        //元素出现的次数
        System.out.println(Collections.frequency(list,"A"));
        //拷贝集合
        ArrayList list1 = new ArrayList();
        for (int i = 0;i < list.size();i++) {
            list1.add("");
        }
        Collections.copy(list1,list);
        System.out.println(list1);

        //元素替换
        Collections.replaceAll(list,"DDDDD","FFFF");
        System.out.println(list);
    }
}
