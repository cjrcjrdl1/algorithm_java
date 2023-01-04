package baekjoon;

import java.util.Scanner;

public class n_2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        String answer = "";
        for (char a : chars) {
            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
            } else {
                a = Character.toUpperCase(a);
            }
            answer += a;
        }

        System.out.println(answer);
    }
}


