package baekjoon;

import java.util.Scanner;

public class n_2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double power = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            power += Math.pow(n, 2);
        }
        int result = (int)power % 10;

        System.out.println(result);

    }
}


