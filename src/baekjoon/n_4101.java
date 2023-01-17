package baekjoon;

import java.util.Scanner;

public class n_4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}


