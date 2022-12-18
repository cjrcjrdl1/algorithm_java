package baekjoon;

import java.util.Scanner;

public class n_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] s = new int[n];
        for(int i = 0;i<n;i++){
            s[i] = scanner.nextInt();
        }
        int r = scanner.nextInt();

        int result = 0;

        for (int i : s) {
            if (r == i) {
                result++;
            }
        }
        System.out.println(result);

    }
}


