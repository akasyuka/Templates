import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        Product product = new Product("Степа");
        System.out.println(product.hashCode());

        new HashMap<>();
        String
    }

}
class Product {
    final String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

