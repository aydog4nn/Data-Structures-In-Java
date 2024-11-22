import java.util.Scanner;

public class BagliListe {
    MusteriNode head = null;
    MusteriNode tail = null;

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;

    Scanner sc = new Scanner(System.in);

    void ekle() {
        System.out.println("Musterinin bilgilerini giriniz:");
        System.out.println("Numarasi:");
        id = sc.nextInt();
        System.out.println("Adi     :");
        ad = sc.nextLine();
        System.out.println("Soyadi  :");
        soyad = sc.nextLine();
        System.out.println("Telefon :");
        tel = sc.nextLine();
        System.out.println("Adresi  :");
        adres = sc.nextLine();
        System.out.println("Urun    :");
        urun = sc.nextLine();

        MusteriNode eleman = new MusteriNode(id, ad, soyad, tel, adres, urun);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste olusturuldu,ilk musteri kayit edildi!");
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.printf(id + "numarasi musteri kayit edildi!");
        }

    }

    void sil() {

        boolean sonuc = false;
        if (head == null) {
            System.out.println("Liste bos;");
        } else {
            System.out.println("Silinecek Musteri numarasi:");
            id = sc.nextInt();
            sc.nextLine();

            if (head.next == null && head.id == id) {
                head = null;
                tail = null;
                System.out.println(id + "numarali musteri silindi!");
                sonuc = true;
            } else if (head.next != null && head.id == id) {
                head = head.next;
                head.prev = null;
                System.out.println(id + "numarali musteri silindi!");
                sonuc = true;

            } else if (tail.id == id) {
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + "numarali musteri silindi!");
                sonuc = true;

            } else {
                MusteriNode temp = head;
                while (temp.next != null) {
                    if (temp.id == id) {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        sonuc = true;

                        break;
                    }
                    temp = temp.next;
                }
            }
            if (!sonuc) {
                System.out.println(id + "numarali musteri listede yok!");
            }
        }


        MusteriNode eleman = new MusteriNode(id, ad, soyad, tel, adres, urun);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste olusturuldu,ilk musteri kayit edildi!");
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.printf(id + "numarasi musteri kayit edildi!");
        }

    }

    void guncelle() {

        boolean sonuc = false;
        if (head == null) {
            System.out.println("Liste bos;");
        } else {
            System.out.println("Guncellenecek Musteri numarasi:");
            id = sc.nextInt();
            sc.nextLine();


            MusteriNode temp = head;
            while (temp.next != null) {
                if (temp.id == id) {

                    System.out.println(id + "numarali musteri bilgileri:");
                    System.out.println("Ad     : " + temp.ad);
                    System.out.println("Soyad  : " + temp.soyad);
                    System.out.println("Telefon: " + temp.tel);
                    System.out.println("Adres  : " + temp.adres);
                    System.out.println("Urun   : " + temp.urun);

                    System.out.println("Urun bilgisini guncelleyin...");
                    temp.urun = sc.nextLine();
                    System.out.println("Urun bilgisi guncellendi!");
                    sonuc = true;
                    break;
                }
                temp = temp.next;
            }

            if (!sonuc) {
                System.out.println(id + "numarali musteri listede yok!");
            }
        }






    }

}





