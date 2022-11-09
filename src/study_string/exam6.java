package study_string;

import java.util.Scanner;

public class exam6 {
    public String solution(String str) {
        String answer ="";

        for (int i = 0; i<str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        exam6 T = new exam6();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}


