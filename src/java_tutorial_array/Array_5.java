package java_tutorial_array;

import java.util.Scanner;

public class Array_5 {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j=j+i) { //j가 i의 배수가 되기 위함
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Array_5 T = new Array_5();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(T.solution(n));
        }

}



