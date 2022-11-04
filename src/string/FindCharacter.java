package string;

import java.util.Scanner;

public class FindCharacter {
    public int solution(String str, char t) {
        int answer =0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char a : str.toCharArray()) {
            if (a == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindCharacter T = new FindCharacter();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);

        System.out.println(T.solution(str, t));

    }
}