import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BagliListe liste = new BagliListe();

        int secim = -1,sayi,indis;
        while (secim != 0){
            System.out.println("1=Basa Ekle");
            System.out.println("2=Sona Ekle");
            System.out.println("3=Araya Ekle");
            System.out.println("4=Bastan Sil");
            System.out.println("5=Sondan Sil");
            System.out.println("6=Aradan Sil");
            System.out.println("7= Yazdir.");
            System.out.println("0-Cikis");
            System.out.println("Seciminiz:");

            secim = scanner.nextInt();
            if (secim == 1){
                System.out.println("Sayi:");
                sayi = scanner.nextInt();
                liste.basaEkle(sayi);
            }
            else if (secim == 2){
                System.out.println("Sayi:");
                sayi = scanner.nextInt();
                liste.sonaEkle(sayi);
            }
            else if (secim == 3){
                System.out.println("Indis");
                indis = scanner.nextInt();
                System.out.println("Sayi:");
                sayi = scanner.nextInt();
                liste.arayaEkle(indis,sayi);
            }
            else if (secim == 4)
                liste.bastanSil();
            else if (secim == 5)
                liste.sondanSil();
            else if (secim ==6){
                System.out.print("Indis:");
                indis = scanner.nextInt();
                liste.aradanSil(indis);
            }
            liste.yazdir();
        }

    }
}