package baekjoon;

import java.util.Scanner;

public class n_4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if (a.length() < b.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}


