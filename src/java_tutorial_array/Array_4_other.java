package java_tutorial_array;

import java.util.Scanner;

public class Array_4_other {

    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Array_4_other T = new Array_4_other();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        T.solution(n);
        }

}



