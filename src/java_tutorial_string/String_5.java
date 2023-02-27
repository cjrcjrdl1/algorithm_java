package java_tutorial_string;

import java.util.Scanner;

public class String_5 {

    public String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }
    public static void main(String[] args) {
        String_5 T = new String_5();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));

    }
}



