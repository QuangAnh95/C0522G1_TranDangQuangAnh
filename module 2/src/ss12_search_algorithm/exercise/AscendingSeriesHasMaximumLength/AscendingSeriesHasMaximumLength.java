package ss12_search_algorithm.exercise.AscendingSeriesHasMaximumLength;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingSeriesHasMaximumLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("nhập mảng");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {

                if (string.charAt(j) > list.getLast()) {

                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {

                max.clear();
                max.addAll(list);
            }
            list.clear();
        }


        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();


    }
}
