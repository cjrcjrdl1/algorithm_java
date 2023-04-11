package java_tutorial_recursive_tree_graph;

public class Recursive_3 {
    public int DFS(int n) {
        if (n==1) return 1;
        else return n * DFS(n - 1);
    }



    public static void main(String[] args) {
        Recursive_3 T = new Recursive_3();
        System.out.println(T.DFS(5));

    }
}



