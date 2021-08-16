package senior.study.list_;

import java.util.LinkedList;
import java.util.List;

/**
 * @author αυγή
 */
public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();
        list.add(new BookShop("《西游记》","吴承恩",100));
        list.add(new BookShop("《三国演义》","罗贯中",60));
        list.add(new BookShop("《红楼梦》","曹雪芹",80));
        for (Object o :list) {
            System.out.println(o);
        }

        sort(list);
        System.out.println(list);
        System.out.println(list.getClass());


    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                BookShop bookShop1 = (BookShop) list.get(j);
                BookShop bookShop2 = (BookShop) list.get(j + 1);
                if (bookShop1.getPrice() > bookShop2.getPrice()) {
                    list.set(j, bookShop2);
                    list.set(j + 1, bookShop1);

                }
            }
        }
    }
}

class BookShop {
    private String name;
    private String author;
    private double price;

    public BookShop(String name, String author, double price) {
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
        return "\n名称:" + name + "\t\t价格:" + price + "\t\t作者:" + author;
    }
}
