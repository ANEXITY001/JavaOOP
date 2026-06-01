package streamAPI;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

//        классическое использование

        System.out.println("Normal using");
        for (Integer numer : numbers) {
            if (numer % 2 == 0) {
                System.out.println(numer);
            }
        }

        System.out.println();

//        через StreamAPI

        System.out.println("StreamAPI");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));

        List<Integer> resultCN = numbers.stream()
                .filter(n -> n > 3)
                .collect(Collectors.toList());



//       12.05.2026 - продолжение темы streamAPI


    }
}