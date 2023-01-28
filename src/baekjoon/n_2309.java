package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class n_2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key[] = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            key[i] = scanner.nextInt();
            sum += key[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - key[i] - key[j] == 100) {
                    key[i] = 0;
                    key[j] = 0;
                    Arrays.sort(key);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(key[k]);
                    }
                    return; //발견시 더이상 돌릴 필요가 없으므로 꼭 넣어주자
                }
            }
        }


    }
}



