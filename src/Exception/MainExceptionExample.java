package Exception;

public class MainExceptionExample {

    public static void main(String[] args) {
//        System.out.println(10/ 0);

//        example1();
//        example2();
//        example3();
        example4();
        example5();
        example6();


    }

//    деление на 0
    public static void example1() {
        System.out.println("1. AritmeticException");

        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0");
        }
        System.out.println();
    }

//    NullPointException
    public static void example2() {
        System.out.println("2. NullPointException");

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: пустая строка (null)");
        }
        System.out.println();
    }

//    ArrayIndexOutBonusException
    public static void example3() {
        System.out.println("3. ArrayIndexOutBonusException");

        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: такого индекса нет в списке");
        }
        System.out.println();
    }

//    NumberFormatException
    public static void example4() {
        System.out.println("4. NumberFormatException");

        try {
            int  num = Integer.parseInt("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: строку нельзя преобразить в число");
        }
        System.out.println();
    }

//  finally
    public static void example5() {
        System.out.println("5. finally");

        try {
            System.out.println("код в try");
        } catch (Exception e) {
            System.out.println("код в cath");
        } finally {
            System.out.println("Блок finally выполнился");
        }
        System.out.println();
    }

//    throw
    public static void example6() {
        System.out.println("6. throw");

        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Ощибка: " + e.getMessage());
        }
        System.out.println();
    }
    public static void checkAge(int age) {
        if (age < 18) {
            throw  new IllegalArgumentException("доступ запрещен");
        }
        System.out.println("доступ разрешен");
    }

}