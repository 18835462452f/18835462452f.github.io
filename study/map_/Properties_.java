package senior.study.map_;

import java.util.Properties;

/**
 * @author αυγή
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //不可为空  通过K-V存放数据  相同key 则替换
        properties.put("01",100);
        properties.put("02",200);
        properties.put("03",300);
        properties.put("04",400);
        properties.put("01",600);
        System.out.println(properties);
        //通过Key获取value
        System.out.println(properties.get("03"));
        System.out.println(properties.getProperty("02"));
        //删除
        properties.remove("01");
        System.out.println(properties);

    }
}
