package baekjoon;

import java.util.Scanner;

public class n_9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int len = s.length();
            char[] chars = s.toCharArray();
            System.out.println(chars[0] +""+ chars[len-1]);
        }


    }
}


