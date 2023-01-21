package baekjoon;

import java.util.Scanner;

public class n_2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int out = scanner.nextInt();
            int in = scanner.nextInt();
            int sub = in - out;
            result += sub;
            if (max < result) {
                max = result;
            }
        }

        System.out.println(max);

    }
}



