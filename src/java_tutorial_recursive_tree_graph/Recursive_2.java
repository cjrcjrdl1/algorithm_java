package java_tutorial_recursive_tree_graph;

public class Recursive_2 {
    public void DFS(int n) {
        if (n==0) return;
        else{
            DFS(n / 2);
            System.out.print(n%2 + " ");
        }
    }



    public static void main(String[] args) {
        Recursive_2 T = new Recursive_2();
        T.DFS(11);

    }

}



