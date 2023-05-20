package java_tutorial_recursive_tree_graph;

public class Recursive_4 {
    static int[] fibo; //메모이제이션
    public int DFS(int n) {
        if (fibo[n]>0) return fibo[n];
        if (n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }



    public static void main(String[] args) {
        Recursive_4 T = new Recursive_4();
        int n = 45;
        fibo = new int[n+1]; //인덱스번호를 위해 1을 추가
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+ " ");
        }
    }
}



