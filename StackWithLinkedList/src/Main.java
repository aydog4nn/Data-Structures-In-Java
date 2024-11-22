import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackYapisi liste = new StackYapisi(10);
        liste.push(10);
        int secim = -1,sayi;
        while (secim != 0) {
            System.out.println("1-Ekle");
            System.out.println("2-Cikar");
            System.out.println("3-En usttekini goster");
            System.out.println("4-Yazdir");
            System.out.println("0-Cikis");
            System.out.print("Seciminiz:"); secim = sc.nextInt();

            switch (secim) {
                case 1: System.out.print("Sayi:"); sayi = sc.nextInt();
                    liste.push(sayi); break;
                case 2: liste.pop(); break;
                case 3: liste.topGoster(); break;
                case 4: liste.print(); break;
                case 0: System.out.println("Cikis yaptiniz!"); break;
                default:
                    System.out.println("Hatali secim yaptiniz[0-4]");
            }
        }


    }
}