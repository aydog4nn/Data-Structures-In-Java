public class OgrNode {
    int numara;
    String ad;
    String soyad;
    int vize;
    int finalNot;
    double ortalama;
    String durum;
    OgrNode next;


    public OgrNode(int numara, String ad, String soyad, int vize, int finalNot) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.finalNot = finalNot;

        ortalama = vize*0.4 + finalNot*0.6;
        if (ortalama >= 50){
            durum = "Gecti!";
        }
        else {
            durum = "Kaldi!";
        }

        next = null;

    }





}
