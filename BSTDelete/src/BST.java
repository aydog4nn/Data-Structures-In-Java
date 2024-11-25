public class BST {
    Node root;

    public BST() {
        root = null;
    }

    Node newNode(int x) {
        return new Node(x);
    }

    Node insert(Node root, int x) {
        if (root != null) {
            if (x < root.data) {
                root.left = insert(root.left, x);
            } else {
                root.right = insert(root.right, x);
            }
        } else {
            root = newNode(x);
        }
        return root;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    Node deleteNode(Node root, int x) {
        if (root == null) {
            return null;
        }
        if (x < root.data) {
            root.left = deleteNode(root.left, x);
        } else if (x > root.data) {
            root.right = deleteNode(root.right, x);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node t1 = root.right;
                while (t1.left != null) {
                    t1 = t1.left;
                }
                root.data = t1.data;
                root.right = deleteNode(root.right, t1.data);
            }
        }
        return root;
    }
}
