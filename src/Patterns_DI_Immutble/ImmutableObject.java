package Patterns_DI_Immutble;

public class ImmutableObject {
    public static void main(String[] args) {

    }

    private static void immutableDemo() {
        System.out.println("\n===== 5. Immutable Object =====");

        Product product = new Product("Phone", 900);

        System.out.println(product.getTitle());
        System.out.println(product.getPrice());

        //так делать нельзя, потому что нет setter методов
        //product.SetPrice(1000);
    }

    final static class Product {
        private final String title;
        private final int price;

        public Product(String title, int price) {
            this.title = title;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public int getPrice() {
            return price;
        }
    }

}

