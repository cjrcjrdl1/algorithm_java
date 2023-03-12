package java_tutorial_array;

import java.util.Scanner;

public class Array_4 {

    public int[] solution(int n) {
        int answer[] = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
    public static void main(String[] args) {
        Array_4 T = new Array_4();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}



