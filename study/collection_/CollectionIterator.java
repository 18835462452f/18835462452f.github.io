package senior.study.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author αυγή
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("《西游记》","吴承恩",50));
        collection.add(new Book("《三国演义》","罗贯中",60));
        collection.add(new Book("《红楼梦》","曹雪芹",80));
        System.out.println("collection=" + collection);

        //遍历collection集合
        //先得到集合对应的iterator迭代器
        Iterator iterator = collection.iterator();
        //使用while循环遍历
//        while (iterator.hasNext()) {//判断是否还有数据
//            Object next = iterator.next();
//            System.out.println(next);
//            System.out.println(next.getClass());
//        }
        //快捷键 itit    显示所有快捷生成的快捷键 Ctrl+J
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //当退出while循环，iterator迭代器指向最后的元素elements
        //iterator.next();//NoSuchElementException
        //如果希望再次遍历需要重置iterator迭代器
        iterator = collection.iterator();
        System.out.println("第二次遍历==============");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
            
        }

    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
