package java_tutorial_array;

import java.util.Scanner;

public class Array_8 {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array_8 T = new Array_8();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x+ " ");
        }

    }

}



