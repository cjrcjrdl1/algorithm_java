package java_tutorial_string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_4 {

    public ArrayList<String> solution(int count, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String s = new StringBuilder(x).reverse().toString();
            answer.add(s);
        }

        return answer;
    }
    public static void main(String[] args) {
        String_4 T = new String_4();
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



