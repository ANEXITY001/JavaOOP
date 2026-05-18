package Patterns_DI_Immutble;

public class ImmutableRecordObject {
    public static void main(String[] args) {
        immutableRecordDemo();
    }

    private static void immutableRecordDemo () {
        System.out.println("===== 6. Immutable Record Object =====");

        ProductRecord product = new ProductRecord("laptop", 1500);

        System.out.println(product.title);
        System.out.println(product.price);
        System.out.println(product);

    }

    record ProductRecord(String title, int price) {}
}
