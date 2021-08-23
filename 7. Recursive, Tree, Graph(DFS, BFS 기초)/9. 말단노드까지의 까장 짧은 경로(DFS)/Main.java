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

    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(11);
        tree.root.lt = new Node(22);
        tree.root.rt = new Node(33);
        tree.root.lt.lt = new Node(44);
        tree.root.lt.rt = new Node(55);
        System.out.println(tree.DFS(0, tree.root));
    }
}