package java_tutorial_string;

import java.util.Scanner;

public class String_7 {

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return answer;


    }
    public static void main(String[] args) {
        String_7 T = new String_7();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));

    }
}



