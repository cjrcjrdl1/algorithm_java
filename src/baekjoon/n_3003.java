package baekjoon;

import java.util.Scanner;

public class n_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = scanner.nextInt();
            if (i == 0) {
                num[i] = 1 - num[i];
            } else if (i == 1) {
                num[i] = 1 - num[i];
            } else if (i == 2) {
                num[i] = 2 - num[i];
            } else if (i == 3) {
                num[i] = 2 - num[i];
            } else if (i == 4) {
                num[i] = 2 - num[i];
            } else {
                num[i] = 8 - num[i];
            }
        }

        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}


