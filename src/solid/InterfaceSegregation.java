package solid;

public class InterfaceSegregation {
}

// 1 интерфейс - 1 метод

// пример плохого кода

interface Worker {
    void code();
    void test();
    void manage();
}

// все сразу в одном, это плохо скажется на работе кода

// пример хорошего кода

interface Coder {
    void code();
}

interface Tester {
    void test();
}

interface Manager {
    void manage();
}

// 1 интерфейс - 1 задача, так появляется структурированность
// и более понятное распределение задач для разных отделов