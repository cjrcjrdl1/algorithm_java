package java_tutorial_array;

import java.util.Scanner;

public class Array_7 {

    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Array_7 T = new Array_7();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }

}



