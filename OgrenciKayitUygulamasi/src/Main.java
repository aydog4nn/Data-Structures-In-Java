import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secim = -1;
        OgrListe bilBolum = new OgrListe();

        Scanner scanner = new Scanner(System.in);

        while (secim != 0){
            System.out.println();
            System.out.println("Bilgisayar Bolumu Ogrenci Kayit Uygulamasi");
            System.out.println("1-Yeni Kayit");
            System.out.println("2-Kayit Sil");
            System.out.println("3-Kayitlari Listele");
            System.out.println("4-En Basarili Ogrenci Bilgileri");
            System.out.println("0-Cikis");
            System.out.print("Seciminiz:");


            secim = scanner.nextInt();

            if (secim == 1)
                bilBolum.ekle();
            else if (secim == 2)
                bilBolum.sil();
            else if (secim == 3)
                bilBolum.yazdir();
            else if (secim == 4)
                bilBolum.enBasariliOgrenci();
            else if (secim == 0)
                System.out.println("Programi sonlandirdiniz...");
            else {
                System.out.println("Hatali bir islem yaptiniz!!");
        }
        }

    }
}