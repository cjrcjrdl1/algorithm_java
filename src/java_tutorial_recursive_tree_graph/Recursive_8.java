package java_tutorial_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Recursive_8 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx==e) return L+1; //찾던중 원하는 값이 나오면 리턴, 자식값이기에 +1
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) { //방문x, 음수x, 범위 벗어나지도 x
                        ch[nx] = 1; //체크
                        Q.offer(nx); //추가
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Recursive_8 T = new Recursive_8();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(T.BFS(s,e));
    }
}



