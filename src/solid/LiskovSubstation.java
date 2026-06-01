package solid;

public class LiskovSubstation {
}

// пример плохого кода:

class Bird {
    void fly() {}
}

class Penguin extends Bird {
    void fly() {throw  new RuntimeException();} // сюрприз
}

// мы сломали природу заставив пингвина летать

//пример хорошего кода:

interface Flyble {
    void fly();
}

class Sparrow implements Flyble {
    public void fly() {}
}

class Penguin2 {
    void swim() {}
}

// воробей - может летать
// пингвин - может плавать
// мы разделили ответственности при помощи метода LiskovSubstation