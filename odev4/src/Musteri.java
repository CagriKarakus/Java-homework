import java.security.PublicKey;

public class Musteri {
    private String MusteriAd;
    private String MusteriSoyad;
    private int MusteriNo;

    public String getMusteriAd(){return MusteriAd;}

    public void setMusteriAd(String musteriAd) {
        MusteriAd = musteriAd;
    }

    public String getMusteriSoyad(){return MusteriSoyad;}

    public void setMusteriSoyad(String musteriSoyad) {
        MusteriSoyad = musteriSoyad;
    }

    public int getMusteriNo(){return MusteriNo;}

    public void setMusteriNo(int musteriNo) {
        MusteriNo = musteriNo;
    }

    public Musteri(String MusteriAd, String MusteriSoyad, int MusteriNo){
        this.MusteriAd = MusteriAd;
        this.MusteriSoyad = MusteriSoyad;
        this.MusteriNo = MusteriNo;
    }
    public void BilgiGoster(){
        System.out.println("Müsteri Adı = " + MusteriAd);
        System.out.println("Musteri Soyad = " + MusteriSoyad);
        System.out.println("Musteri no = " + MusteriNo);
    }


}
