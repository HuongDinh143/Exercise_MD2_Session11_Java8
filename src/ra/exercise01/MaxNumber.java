package ra.exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng");
        try {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhập vào phần tử thứ %d: ",i);
                numbers.add(Integer.parseInt(sc.nextLine()));
            }
            System.out.print("Phần tử lớn nhất của mảng là: ");
            numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
        }catch (NumberFormatException e){
            System.err.println(e.getMessage());
        }
    }
}
