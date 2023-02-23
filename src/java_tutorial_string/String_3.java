package java_tutorial_string;

import java.util.Scanner;

public class String_3 {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] split = str.split(" ");
        for (String s : split) {
            if (max < s.length()) {
                max = s.length();
                answer = s;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String_3 T = new String_3();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}



