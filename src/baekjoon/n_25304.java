package baekjoon;

import java.util.Scanner;

public class n_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum =0;
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            int realPrice = price * count;
            sum += realPrice;
        }
        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


