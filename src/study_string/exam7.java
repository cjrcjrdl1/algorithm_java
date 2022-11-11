package study_string;

import java.util.Scanner;

public class exam7 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - 1 - i)) {
//                answer = "NO";
//            }
//        }

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {  //equalsIgnoreCase 이것은 대소문자 구분 무시
            answer = "YES";
        }

        return answer;
    }
    public static void main(String[] args) {
        exam7 T = new exam7();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}


