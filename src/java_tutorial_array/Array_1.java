package java_tutorial_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_1 {

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Array_1 T = new Array_1();
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



