package java_tutorial_array;

import java.util.Scanner;

public class Array_9 {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0; //sum1은 0행, sum2는 0열의 합
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; //i는 고정 j가 순서대로 증가, 즉 행은 고정 열의 총합
                sum2 += arr[j][i]; //행의 총합을 위해 i, j 위치 바꿈
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Array_9 T = new Array_9();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));

    }

}



