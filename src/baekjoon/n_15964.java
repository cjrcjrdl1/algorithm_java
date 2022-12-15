package baekjoon;

import java.util.Scanner;

public class n_15964 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long result = (a + b) * (a - b);

        System.out.println(result);


    }
}


