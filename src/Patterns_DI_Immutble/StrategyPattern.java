package Patterns_DI_Immutble;

public class StrategyPattern {
    public static void main(String[] args) {
        StrategyDemo();
    }

    private static void StrategyDemo() {
        System.out.println("\n===== 1. Straregy Pattern =====");

        PaymentStrategy cardPayment = new CardPayment();
        OrderService orderWithCard = new OrderService(cardPayment);
        orderWithCard.checkout(700);
    }

    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Оплата наличными: " + amount);
        }
    }

    static class CashPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Оплата наличными: " + amount);
        }
    }

    static class BonusPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Оплата бонусами: " + amount);
        }
    }

    static class OrderService {
        private PaymentStrategy paymentStrategy;

        public OrderService(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void checkout(int amount) {
            paymentStrategy.pay(amount);
        }
    }
}