package ra.exercise04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortStreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listStrings = new ArrayList<String>();
        System.out.println("Nhập vào số phần tử của mảng: ");
        try {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhập vào phần tử thứ %d: ", i);
                listStrings.add(sc.nextLine());
            }
            System.out.println("Sắp xếp mảng tăng dần theo bảng chữ cái");
            listStrings.stream().sorted().forEach(System.out::println);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
