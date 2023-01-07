package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class n_3460 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            String answer = Integer.toBinaryString(n);
            for (int j = answer.length() - 1; j >= 0; j--) {
                if (answer.charAt(j) == '1') {
                    System.out.print(answer.length()-1-j + " ");
                }
            }
        }

    }
}


