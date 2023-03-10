package java_tutorial_array;

import java.util.Scanner;

public class Array_2 {

    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Array_2 T = new Array_2();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }

}



