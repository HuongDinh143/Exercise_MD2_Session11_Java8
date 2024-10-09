package ra.exercise05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchForEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 7, 4, 10, 6, 15, 25, 9, 10);
        System.out.println("In ra mảng:");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println("\nDanh sách số chẵn trong mảng: ");
        numbers.stream().filter(number -> number % 2 == 0).forEach(number -> System.out.print(number + " "));
        System.out.println("\nDanh sách các số lớn hơn 10: ");
        numbers.stream().filter(number -> number > 10).forEach(number -> System.out.print(number + " "));

    }
}
