package streamAPI2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

//        классическое использование

        System.out.println("For Each");
        for (Integer nubmer : numbers) {
            if (nubmer % 2 == 0) {
                if (nubmer == 2) {
                    int numNew = nubmer * nubmer;
                    System.out.println(numNew);
                }
            }
        }

        System.out.println("StreamAPI");
        Integer result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .findFirst()
                .orElse(null);

        System.out.println(result);

        System.out.println("StreamAPI");
        boolean result2 = numbers.stream()
                .allMatch(n -> n > 8);
        System.out.println(result2);

    }
}