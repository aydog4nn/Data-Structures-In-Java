public class BagliListe {
    Node head = null;
    Node tail = null;


    void basaEkle(int data){
        Node eleman = new Node(data);
        if(head == null){
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }

    void arayaEkle(int indis,int data){
        Node eleman = new Node(data);
        if(head == null){
            head = eleman;
            tail = eleman;
        }
        else if (head != null && indis == 0 ){
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
        else{
            int n = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                n++;
            }
            temp = head;
            if (indis > n){
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
            }
            else {
                int i = 0;
                while (i != indis){
                    temp = temp.next;
                    i++;
                }
                eleman.prev = temp.prev;
                temp.prev.next = eleman;
                eleman.next = temp;
                temp.prev = eleman;
            }
        }
    }




    void sonaEkle(int data){
        Node eleman = new Node(data);
        if(head == null){
            head = eleman;
            tail = eleman;
        }
        else{
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }

    void yazdir(){
        Node temp = head;
        System.out.print("Bas->");
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Son");
    }
    void sondanYazdir(){
        Node temp = tail;
        System.out.print("Son->");
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("Bas");
    }
}
