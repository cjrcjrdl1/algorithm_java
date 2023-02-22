package java_tutorial;

import java.util.Scanner;

public class String_2 {

    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer+=Character.toLowerCase(x);
            } else {
                answer+=Character.toUpperCase(x);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String_2 T = new String_2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}



