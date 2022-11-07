package study_string;

import java.util.ArrayList;
import java.util.Scanner;

public class exam4 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length - 1;
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
        exam4 T = new exam4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}


