import java.sql.SQLOutput;

public class BTree {

    Node root;

    public BTree() {
        root = null;
    }

    Node newNode(int data) {
        Node newNode = new Node(data);
        System.out.println(data + " ağaca eklendi!");
        return newNode;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return root;
    }


}


