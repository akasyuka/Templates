// И это ООП? Че за хуйовый класс? еще и мейн в нем, ПИЗДЕЦ!
public class Equals {
    public static void main(String[] args) {
        String str1 = "Саша";
        // Прошу замететь
        String str2 = "Гей";

        // Выведит истину
        System.out.println(str1.equals(str2));

        String str3 = "Са";
        String str4 = "ша";
        String str5 = str3 + str4;
        System.out.println(str3 + str4);
        System.out.println(str1.hashCode());
        System.out.println(str5.hashCode());

        Integer int1 = 15;
        System.out.println(int1.hashCode());
        int int2 = 15;
//        System.out.println(int2.hashCode());

        String str6 = "15";
        System.out.println(str6.hashCode());
        System.out.println(str6.equals(int1));

        System.out.println((str6.toString()).hashCode());

        Stringa class1 = new Stringa("Саша");
        System.out.println(class1.hashCode());
        System.out.println(class1);
        System.out.println(str1.equals(class1));

    }
}

// Пиздец! Ты это так сущность определил? Иди в детский сад фигуры в дырки пихай!
class Stringa {

    String str1 = "Саша";

    public Stringa(String str1) {
        this.str1 = str1;
    }
}
