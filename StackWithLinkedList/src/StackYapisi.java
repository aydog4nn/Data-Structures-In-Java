public class StackYapisi {
    int size;
    int cnt;
    Node top;

    public StackYapisi(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(int data) {
        Node eleman = new Node(data);
        if (isFull()){
            System.out.println("Stack is full");
        }
        else {
            if (isEmpty()){
                top = eleman;
                System.out.println(top.data + "stack yapisina ilk eleman olarak eklendi!");
            }
            else {
                eleman.next = top;
                top = eleman;
                System.out.println(top.data + "stack'e eklendi!");
            }

            cnt++;
        }
    }

    void pop (){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(top.data + "cikartildi!");
            top = top.next;
            cnt --;
        }
    }

    void print(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            Node temp = top;
            System.out.println("Stack'teki veriler\n");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }

    void topGoster(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("En ustteki dugumun datasi:" + top.data);
        }
    }


    boolean isFull(){
        return cnt == size;
    }
    boolean isEmpty(){
        return cnt == 0;
    }
}
