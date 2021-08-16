package senior.study.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author αυγή
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("001",new Employ("Tom",8000,"001"));
        map.put("002",new Employ("Fjx",80000,"002"));
        map.put("003",new Employ("Jack",12000,"003"));
        //遍历
        //1.keySet  ->增强for
        Set set = map.keySet();
        for (Object key :set) {
            //先获取value
            Employ employ = (Employ) map.get(key);
            if (employ.getSalary() > 18000) {
                System.out.println(employ);
            }
        }
        //2.使用EntrySet迭代器遍历
        Set set1 = map.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            //通过entry取出k-v
            Employ employ = (Employ) entry.getValue();
            if (employ.getSalary() > 18000) {
                System.out.println(employ);
            }

        }

    }
}
class Employ {
    private String name;
    private double salary;
    private String id;

    public Employ(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
