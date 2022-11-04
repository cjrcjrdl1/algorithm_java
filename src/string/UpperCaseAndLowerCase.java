package string;

import java.util.Scanner;

public class UpperCaseAndLowerCase {
    public String solution(String str) {
        String answer = "";

//        for (char a : str.toCharArray()) {
//            if (Character.isUpperCase(a)) {
//                answer += Character.toLowerCase(a);
//            } else {
//                answer += Character.toUpperCase(a);
//            }
//        }
        for (char a : str.toCharArray()) {
            if (a >= 65 && a <= 90) {
                answer += (char) (a + 32);
            } else {
                answer += (char) (a - 32);
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        UpperCaseAndLowerCase T = new UpperCaseAndLowerCase();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));

    }
}