import java.util.*;

public class Sets{
    public static void main(String[] args) {
//Set
//    Особенноти: - Уникальность значений
//TreeSet(Хранение в отсортированном порядке)
//        Особенности: - Хранение значений отсортированными

        Set<String> states = new TreeSet<>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");

        for(String state : states){
            System.out.println(state + " " + state.hashCode());
        }
//        Вопросы: - Почему если TreeSet поставить в конец main, метод add будет красным?
//                 -
//                 - TreeSet это красно-черное дерево?


//HashSet(Хранение в разном порядке)
//        Хранение в разном порядке
//        HashSet(int capacity): параметр capacity указывает начальную емкость таблицы,
//        которая по умолчанию равна 16 (CAPACITY OF BUCKET)
//        HashSet(int capacity, float koef): параметр koef или коэффициент заполнения,
//        значение которого должно быть в пределах от 0.0 до 1.0, указывает,
//        насколько должна быть заполнена емкость объектами прежде чем произойдет ее расширение.
//        Например, коэффициент 0.75 указывает, что при заполнении емкости на 3/4 произойдет ее расширение.
        Set<String> products = new HashSet<>();

        products.add("Какао");
        products.add("Молоко");
        products.add("Кофе");
        products.remove("Молоко");
//        products.add("Молоко");Ошибки не будет,но значение не добавится;
        for(String product : products) {
            System.out.println(product + " " + product.hashCode());
        }

        Set<Men> men = new HashSet<>();
        men.add(new Men("Саша", 23));
        men.add(new Men());
        men.remove(new Men("Саша", 23));
        for(Men man : men) {
            System.out.println(man + " " + man.hashCode() + " " + man.getName());
        }

        String str1 = "Саша";
        String str2 = "C fifi"
        System.out.println(false);
//
    }
//LinkedHashSet(Хранение в порядке добавления)

}
class Men{
    private String name;
    private int age;

    public Men(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Men() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
