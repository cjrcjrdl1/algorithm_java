package java_tutorial_string;

import java.util.Scanner;

public class String_8 {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }
    public static void main(String[] args) {
        String_8 T = new String_8();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(T.solution(str));

    }
}



