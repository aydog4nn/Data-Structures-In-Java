import java.util.Scanner;

public class OgrListe {
    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp = null;
    OgrNode temp2 = null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int finalNot;
    double ortalama;
    String durum;
    OgrNode next;

    Scanner scanner = new Scanner(System.in);

    void ekle(){
        System.out.println("Bilgisayar bolumune kayit olacak ogrenci bilgilerini giriniz:");
        System.out.println("Numara: "); numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ad: "); ad = scanner.nextLine();
        System.out.println("Soyad: "); soyad = scanner.nextLine();
        System.out.println("Vize: "); vize = scanner.nextInt();
        System.out.println("Final: "); finalNot  = scanner.nextInt();

        OgrNode eleman = new OgrNode(numara, ad, soyad, vize, finalNot);

        if (head == null){
            head = eleman;
            tail = eleman;
            System.out.println("Bilgisayar bolumune kayit olacak ogrencilerin liste yapisi olusturuldu!");
            }
        else {
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numarali ogrenci bolume kayit edildi!");
        }

    }

    void sil() {
        if (head == null){
            System.out.println("Liste bos,silinecek ogrenci yok!");
        }
        else {
            System.out.println("Silmek istediginiz ogrencinin numarasini giriniz:");
            numara = scanner.nextInt();

            if (numara == head.numara && head.next == null){
                head = null;
                tail = null;
                System.out.println(numara + "numarali ogrenci silindi.Listede kayitli ogrenci kalmadi!");
            }
            else if (numara  == head.numara && head.next != null){
                head = head.next;
                System.out.println(numara + "numarali ogrenci silindi.");
            }
            else {
                temp = head;
                temp2 = head;
                while (temp.next != null){

                    if (numara == temp.numara){
                        temp2.next = temp.next;
                        System.out.println(numara + "numarali ogrenci silindi.");

                    }

                    temp2 = temp;
                    temp = temp.next;

                }

                if (numara == temp.numara){
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(numara + "numarali ogrenci silindi.");
                }
            }
        }
    }

    void yazdir(){
        if (head == null){
            System.out.println("Liste bos!");
        }
        else {
            temp = head;
            while (temp.next != null){
                System.out.println(temp.numara + "numarali ogrencinin bilgileri:");
                System.out.println("******************************************");
                System.out.println("Ad      : "+ temp.ad);
                System.out.println("Soyad   : "+ temp.soyad);
                System.out.println("Vize    : "+ temp.vize);
                System.out.println("Final   : "+ temp.finalNot);
                System.out.println("Ortalama: "+ temp.ortalama);
                System.out.println("Durum   : "+ temp.durum);
                System.out.println("******************************************");
                temp = temp.next;

            }
        }
    }

    void enBasariliOgrenci(){
        if (head == null){
            System.out.println("Liste bos!");
        }
        else {
            temp = head;
            double ortalama;
            while (temp.next != null){



                temp = temp.next;

            }
            System.out.println(temp.numara + "numarali ogrencinin bilgileri:");
            System.out.println("******************************************");
            System.out.println("Ad      : "+ temp.ad);
            System.out.println("Soyad   : "+ temp.soyad);
            System.out.println("Vize    : "+ temp.vize);
            System.out.println("Final   : "+ temp.finalNot);
            System.out.println("Ortalama: "+ temp.ortalama);
            System.out.println("Durum   : "+ temp.durum);
            System.out.println("******************************************");

        }
    }
}
