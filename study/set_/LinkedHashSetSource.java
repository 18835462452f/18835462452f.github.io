package senior.study.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author αυγή
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(666);
        set.add(666);
        set.add(new Customer("冯",60000));
        set.add(123);
        set.add("Fjx");
        System.out.println(set);
    }
}
class  Customer {
    private String name;
    private double salary;

    public Customer(String name, double num) {
        this.name = name;
        this.salary = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", num=" + salary +
                '}';
    }
}
