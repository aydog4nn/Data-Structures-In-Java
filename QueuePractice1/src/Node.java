public class Node {
    String isim;
    int adet;
    int ucret;
    Node next;

    public Node(String isim, int adet) {
        this.isim = isim;
        this.adet = adet;

        ucret = adet * 4;

    }
}
