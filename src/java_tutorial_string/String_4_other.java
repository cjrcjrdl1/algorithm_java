package java_tutorial_string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_4_other {

    public ArrayList<String> solution(int count, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        String_4_other T = new String_4_other();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        String[] str = new String[count];

        for (int i = 0; i < count; i++) {
            str[i] = scanner.next();
        }

        for (String x : T.solution(count, str)) {
            System.out.println(x);
        }
    }
}



