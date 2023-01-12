package baekjoon;

import java.util.Scanner;

public class n_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[31];

        for (int i = 1; i <= 28; i++) {
            int a = scanner.nextInt();
            arr[a] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }
    }
}


