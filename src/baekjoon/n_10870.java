package baekjoon;

import java.util.Scanner;

public class n_10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int fibo[] = new int[count+2]; // 0일 경우 런타임 에러 발생

        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= count; i++) {
            int num = fibo[i - 1] + fibo[i - 2];
            fibo[i] = num;
        }

        System.out.println(fibo[count]);

    }
}



