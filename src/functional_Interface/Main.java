package functional_Interface;

public class Main {
    public static void main(String[] args) {

//        классический способ

        String text1 = "Hello Java";

        Printable printer1 = new ConsolePrinter();
        printer1.print(text1);

//        нетрадиционный способ вывода через lambda

        Printable printer2 = text -> System.out.println(text);
        printer2.print(text1);

//        теперь работаем с Calculable

        Calculable sum = (a , b) -> a + b;
        Calculable minus = (a , b) -> a - b;
        Calculable multiply = (a , b) -> a * b;

        int a = 10;
        int b = 20;

        System.out.println(sum.Calculate(a, b)); // 30
        System.out.println(minus.Calculate(a, b)); // -10
        System.out.println(multiply.Calculate(a, b)); // 200
    }
}