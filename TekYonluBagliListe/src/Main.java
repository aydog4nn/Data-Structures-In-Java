public class Main {
    public static void main(String[] args) {


        TekYonluListeYapisi tyList = new TekYonluListeYapisi();
        tyList.basaEkle(10);
        tyList.sonaEkle(20);
        tyList.sonaEkle(30);
        tyList.sonaEkle(40);
        tyList.sonaEkle(50);
        tyList.yazdir();
        tyList.arayaEkle(3,55);
        tyList.sonaEkle(60);
        tyList.yazdir();
        tyList.aradanSil(2);
        tyList.yazdir();



    }
}