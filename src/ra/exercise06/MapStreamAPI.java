package ra.exercise06;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<String> list1 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
//        System.out.println("Chuyển mảng sang in hoa");
//        List<String> capitalList1 = list1.stream().map(String::toUpperCase).toList();
//        System.out.println(capitalList1);
        List<String> listStrings = new ArrayList<String>();
        System.out.println("Nhập vào số phần tử của mảng: ");
        try {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhập vào phần tử thứ %d: ", i);
                listStrings.add(sc.nextLine());
            }
            System.out.println("Chuyển đổi thành mảng chuỗi IN HOA");
            List<String> capitalString = listStrings.stream().map(String::toUpperCase).toList();
            capitalString.forEach(element -> System.out.print(element + " "));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
