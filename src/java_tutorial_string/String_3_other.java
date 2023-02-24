package java_tutorial_string;

import java.util.Scanner;

public class String_3_other {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if (str.length() > max) {
            answer = str;
        }

        return answer;
    }
    public static void main(String[] args) {
        String_3_other T = new String_3_other();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}



