package study_string;

import java.util.Scanner;

public class exam2 {
    public String solution(String str) {
        String answer = "";

//        for (char x : str.toCharArray()) {
//            if (Character.isUpperCase(x)) {
//                answer += Character.toLowerCase(x);
//            } else {
//                answer += Character.toUpperCase(x);
//            }
//        }

        for (char x : str.toCharArray()) {
            if (x >= 65 && x <= 90) {
                answer += (char)(x + 32);
            } else {
                answer += (char)(x - 32);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        exam2 T = new exam2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}


