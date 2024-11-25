public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 12);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 9);
        bst.root = bst.insert(bst.root, 25);


        System.out.print("PreOrder:");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.print("InOrder:");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.print("PostOrder:");
        bst.postOrder(bst.root);

        System.out.println("\n\nAgacin yuksekligi:" + bst.height(bst.root));
        System.out.println("\nAgac uzerindeki eleman sayisi:" + bst.size(bst.root));
    }
}