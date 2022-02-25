
public class Equals {
    public static void main(String[] args) {
        String str1 = "Саша";
        String str2 = "Слава";
        System.out.println("Hello world!");

        System.out.println();
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

class Stringa {

    String str1 = "Саша";

    public Stringa(String str1) {
        this.str1 = str1;
    }
}
