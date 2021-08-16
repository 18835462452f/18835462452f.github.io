package senior.study.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author αυγή
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("《西游记》","吴承恩",50));
        collection.add(new Book("《三国演义》","罗贯中",60));
        collection.add(new Book("《红楼梦》","曹雪芹",80));
        System.out.println("collection=" + collection);

        //增强for
//        for (Object book : collection) {
//            System.out.println(book);
//        }
        //快捷键 I
        for (Object o : collection) {
            System.out.println(o);
        }

    }
}
