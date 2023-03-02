package java_tutorial_string;

import java.util.Scanner;

public class String_7_other {

    public String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            return "YES";
        }

        return answer;
    }
    public static void main(String[] args) {
        String_7_other T = new String_7_other();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));

    }
}



