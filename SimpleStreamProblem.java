import java.util.List;

public class SimpleStreamProblem {
    public static void main(String[] args) {

        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        input.stream()
            .filter(num -> num % 2 != 0)
            .map(num -> num * num).forEach(System.out::println);



    }
}
