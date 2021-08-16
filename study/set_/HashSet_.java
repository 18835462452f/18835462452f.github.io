package senior.study.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author αυγή
 */
public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //添加    void boolean
        System.out.println(hashSet.add("Jack"));
        System.out.println(hashSet.add("Jhon"));
        System.out.println(hashSet.add("Jhon"));
        System.out.println(hashSet.add("Milan"));
        System.out.println(hashSet.add("Smith"));
        System.out.println(hashSet.add("Bell"));
        hashSet.remove("Milan");
        System.out.println("hashSet=" + hashSet);

        hashSet = new HashSet();
        System.out.println(hashSet);
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Cat("mm"));
        hashSet.add(new Cat("mm"));
        System.out.println("hashSet=" + hashSet);

        //经典面试题
        hashSet.add(new String("Fjx"));//ok
        hashSet.add(new String("Fjx"));//no
        System.out.println("hashSet=" + hashSet);
    }
}
class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
