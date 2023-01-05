package baekjoon;

import java.util.Scanner;

public class n_2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        double result =0;
        if (s.equals("A+")) {
            result = 4.3;
        } else if (s.equals("A0")) {
            result = 4.0;
        } else if (s.equals("A-")) {
            result=3.7;
        } else if (s.equals("B+")) {
            result=3.3;
        } else if (s.equals("B0")) {
            result=3.0;
        } else if (s.equals("B-")) {
            result=2.7;
        } else if (s.equals("C+")) {
            result=2.3;
        }else if (s.equals("C0")) {
            result=2.0;
        }else if (s.equals("C-")) {
            result=1.7;
        }else if (s.equals("D+")) {
            result=1.3;
        }else if (s.equals("D0")) {
            result=1.0;
        }else if (s.equals("D-")) {
            result=0.7;
        }else if (s.equals("F")) {
            result=0.0;
        }

        System.out.println(result);

    }
}


