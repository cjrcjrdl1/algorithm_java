package java_tutorial_recursive_tree_graph;

public class Recursive_1 {
    public void DFS(int n) {
        if (n==0) return;
        else{
            DFS(n-1); //재귀 함수는 스택 구조를 사용
            //스택에는 매개변수, 지역변수, 복귀주소 정보가 있음
            System.out.print(n + " ");
            //1 2 3으로 뜨는 이유 -> 스택구조이기 때문(아래서부터 쌓고 뺄땐 제일 위부터)
        }
    }



    public static void main(String[] args) {
        Recursive_1 T = new Recursive_1();
        T.DFS(3);

    }

}



