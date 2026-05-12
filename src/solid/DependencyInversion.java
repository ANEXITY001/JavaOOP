package solid;

//наш класс не должен сильно зависеть от остальных конкретных классов

public class DependencyInversion {
}

// пример плохого кода

class EmailSender {
    void send (String msg) {}
}
class NotifyService {
    EmailSender sender = new EmailSender();
    void notify(String msg) {sender.send(msg);}
}

// пример хорошего кода

interface Sender {
    void send(String msg);
}

class EmailSender2 implements Sender {
    public void send(String msg) {}
}

class NotifyService2 {
    private final Sender sender;

    public NotifyService2(Sender sender) { this.sender = sender;}

    void notify(String msg) {sender.send(msg);}
}