package binaryTree;


public class BinaryTreesYT {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.println("-1");
                return;
            }
            preorder(root.left);
            System.out.println(root.data + " ");
            preorder(root.right);
        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            preorder(root);
        }
    }

}
