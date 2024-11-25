public class Main {
    public static void main(String[] args) {

        BST bst = new BST();

        bst.root = bst.insert(bst.root,10);
        bst.root = bst.insert(bst.root,20);
        bst.root = bst.insert(bst.root,40);
        bst.root = bst.insert(bst.root,7);

    }
}