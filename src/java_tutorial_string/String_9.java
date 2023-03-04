package java_tutorial_string;

import java.util.Scanner;

public class String_9 {

    public Integer solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        for (char x : c) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        Integer result = Integer.valueOf(answer);

        return result;
    }
    public static void main(String[] args) {
        String_9 T = new String_9();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(T.solution(str));

    }
}



