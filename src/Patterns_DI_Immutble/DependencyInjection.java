package Patterns_DI_Immutble;

public class DependencyInjection {
    public static void main(String[] args) {

    }

    public static void dependencyInjectionDemo() {
        System.out.println("\n===== 4. Dependency Injection =====");

        MessageSender emailSender = new EmailSender();
        NotificationService emailNofiction = new NotificationService(emailSender);
        emailNofiction.notifyUser("Ваш заказ готов");

        TelegramSender telegramSender = new TelegramSender();
        NotificationService telegramNofiction = new NotificationService(emailSender);
        telegramNofiction.notifyUser("Ваш заказ готов");
    }

    interface MessageSender {
        void send (String massage);
    }

    static class EmailSender implements MessageSender {
        public void send(String massage) {
            System.out.println("Email: " + massage);
        }
    }

    static class TelegramSender implements MessageSender {
        public void send(String massage) {
            System.out.println("Telegram: " + massage);
        }
    }

    static class NotificationService {
        private MessageSender sender;

        public NotificationService (MessageSender sender) {
            this.sender = sender;
        }

        public void notifyUser (String massage) {
            sender.send(massage);
        }
    }
}

//класс не должен зависить от других классов