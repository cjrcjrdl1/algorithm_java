package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class n_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(result);

        System.out.println(result[0] + " " + result[n - 1]);
    }
}


