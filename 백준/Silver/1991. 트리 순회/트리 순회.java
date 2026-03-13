import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static StringBuilder sb = new StringBuilder();
    private static class Tree {
        char value;
        Tree left;
        Tree right;

        public Tree(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Tree> map = new HashMap<>();

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            map.putIfAbsent(parent, new Tree(parent));
            Tree parentNode = map.get(parent);

            if (left != '.') {
                map.putIfAbsent(left, new Tree(left));
                parentNode.left = map.get(left);
            }

            if (right != '.') {
                map.putIfAbsent(right, new Tree(right));
                parentNode.right = map.get(right);
            }
        }
        br.close();

        preorder(map.get('A'));
        sb.append("\n");

        inorder(map.get('A'));
        sb.append("\n");

        postorder(map.get('A'));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void preorder(Tree root) {
        if (root == null) return;
        sb.append(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Tree root) {
        if (root == null) return;
        inorder(root.left);
        sb.append(root.value);
        inorder(root.right);
    }

    private static void postorder(Tree root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        sb.append(root.value);
    }
}