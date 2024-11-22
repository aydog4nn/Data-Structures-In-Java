public class MusteriNode {
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;

    MusteriNode next;
    MusteriNode prev;

    public MusteriNode(int id, String ad, String tel, String soyad, String adres, String urun) {
        this.id = id;
        this.ad = ad;
        this.tel = tel;
        this.soyad = soyad;
        this.adres = adres;
        this.urun = urun;
        next = null;
        prev = null;
    }


}
