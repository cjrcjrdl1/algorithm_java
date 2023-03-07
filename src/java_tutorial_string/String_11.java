package java_tutorial_string;

import java.util.Scanner;

public class String_11 {
    
    public String solution(String str) {
        String answer = "";
        str = str + " "; // 마지막 인덱스도 비교해야 하기 때문에 공백을 추가해줌
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) { // i는 빈문자 전까지 해야하므로 length-1
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String_11 T = new String_11();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(T.solution(str));

    }
}



