import java.util.*;

public class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null)
                    Q.add(cur.lt);
                if (cur.rt != null)
                    Q.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(100);
        tree.root.rt = new Node(2345);
        tree.root.lt.lt = new Node(44);
        tree.root.lt.rt = new Node(55);
        tree.BFS(tree.root);
    }
}