public class TekYonluListeYapisi {
    Node head =  null;
    Node tail = null;

    void basaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;


        if (head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluştu,ilk eleman eklendi!");
        }
        else {
            eleman.next = head;
            head = eleman;
            System.out.println("Basa eleman eklendi!");
        }
    }

    void arayaEkle (int indis , int x ){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null && indis == 0){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapisi olusturuldu,ilk eleman eklendi!");
        }
        else if (head != null && indis == 0){
            eleman.next = head;
            head = eleman;
            System.out.println(indis + "indisinci siraya yeni eleman eklendi!");
        }
        else {
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp.next != null){
                n ++;
                temp2 = temp;
                temp = temp.next;

            }
            if (n == indis){
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi!");
            }
            else {
                temp = head;
                temp2 = head;
                int i=0;
                while (i != indis){
                    temp2 = temp;
                    temp = temp.next;
                    i++;

                }

                temp2.next = eleman;
                eleman.next = temp;

                System.out.println(indis + ".siraya yeni eleman eklendi!");
            }
        }

    }


    void sonaEkle (int x){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu,ilk eleman eklendi");
        }
        else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
        }
    }

    void yazdir(){
        if (head == null){
            System.out.println("Liste yapisi bos!");
        }
        else {
            Node temp = head;
            System.out.println("Baş--->");
            while (temp.next != null){
                System.out.println(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Son!");
        }
    }
}
