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
            System.out.println("4=Sondan Yazdir.");
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
            liste.yazdir();
        }

    }
}