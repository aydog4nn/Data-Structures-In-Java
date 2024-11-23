public class QueueYapisi {
    Node front;
    Node rear;
    int count;
    int size;

    public QueueYapisi(int size) {
        this.size = size;
        count = 0;
        front = null;
        rear = null;
    }

    void enQueue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else {
            Node eleman = new Node(data);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println(data + "ilk eleman olarak kuyruga eklendi!");
            }
            else {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " kuyruga eklendi!");
            }
            count++;
        }
    }

    void deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            System.out.println(front.data + " silindi");
            front = front.next;
        }
        count--;
    }

    private boolean isEmpty(){
        return count == 0;
    };
    private boolean isFull(){
        return count == size;
    }

    void yazdir (){
        if (isEmpty()){
            System.out.println("Kuyruk bos,yazdirilacak eleman yok!");
        }
        else {
            Node temp = front;
            System.out.print("Bas<=");
            while (temp != null){
                System.out.print(temp.data + "<=");
                temp = temp.next;
            }
            System.out.println("Son");
        }
    }
}
