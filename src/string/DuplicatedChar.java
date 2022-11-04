package string;

import java.util.Scanner;

public class DuplicatedChar {
    public String solution(String str) {
        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.indexOf(str.charAt(i)) == i) {
//                answer += str.charAt(i);
//            }
//        }

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DuplicatedChar T = new DuplicatedChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
        }
}
