import java.util.*;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null)
                    return L;
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(11);
        tree.root.lt = new Node(22);
        tree.root.rt = new Node(33);
        tree.root.lt.lt = new Node(44);
        tree.root.lt.rt = new Node(55);
        System.out.println(tree.BFS(tree.root));
    }
}