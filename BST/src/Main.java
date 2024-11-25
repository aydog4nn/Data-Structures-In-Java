public class Main {
    public static void main(String[] args) {

        BTree bt = new BTree();
        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 8);
        bt.root = bt.insert(bt.root, 20);
        bt.root = bt.insert(bt.root, 4);
        bt.root = bt.insert(bt.root, 12);

        System.out.println(bt.root.data);
        System.out.println(bt.root.right.data);
        System.out.println(bt.root.right.right.data);
        System.out.println(bt.root.right.left.data);
        System.out.println(bt.root.left.data);
        System.out.println(bt.root.left.left.data);

    }
}
