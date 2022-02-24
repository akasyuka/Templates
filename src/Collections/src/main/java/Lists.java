import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
//Элементов не фиксированно, обычный массив, вывод не в порядке добавления
        ArrayList<String> products = new ArrayList<>();
        products.add("Молоко");
        products.add("Хлеб");
        products.add("Мясо");
        System.out.println(products.get(0));
        products.add(0,"Гречка");

        for(String product: products) {
            System.out.println(product);
        }
        System.out.println("________________");
        Collections.sort(products);
        for(String product: products) {
            System.out.println(product);
        }
        System.out.println("________________");


//Реализует интерфейсы List, Dequeue и Queue. То есть он соединяет функциональность
//работы со списком и фукциональность очереди. First,Last
        LinkedList<String> men = new LinkedList<>();
        men.add("Игорь");
        men.addFirst("Саша");
        men.addLast("Дима");
        for(String man:men) {
            System.out.println(man);
        }
        men.remove(1);
        System.out.println(men.get(1));
        men.set(1,"Степа");
        System.out.println(men.get(1));
    }

}
