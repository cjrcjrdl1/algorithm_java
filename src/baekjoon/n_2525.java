package baekjoon;

import java.util.Scanner;

public class n_2525 {
    public String solution(int A, int B, int C) {
        int min = A * 60 + B + C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        return hour + " " + minute;
    }
    public static void main(String[] args) {
        n_2525 T = new n_2525();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(T.solution(A, B, C));
    }
}


