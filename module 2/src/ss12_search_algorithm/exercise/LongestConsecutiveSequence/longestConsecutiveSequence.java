package ss12_search_algorithm.exercise.LongestConsecutiveSequence;

import java.util.ArrayList;
import java.util.Scanner;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i)<=string.charAt(i-1)){
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}
