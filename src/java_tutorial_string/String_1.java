package java_tutorial_string;

import java.util.Scanner;

public class String_1 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(t==x){
                answer+=1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String_1 T = new String_1();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(T.solution(str,c));
    }
}



