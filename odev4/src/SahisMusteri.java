public class SahisMusteri extends Musteri {
    private int TelefonNo;

    public int getTelefonNo(){return TelefonNo;}

    public void setTelefonNo(int telefonNo) {
        TelefonNo = telefonNo;
    }

    public SahisMusteri(String MusteriAd, String MusteriSoyad, int MusteriNo, int TelefonNo){
        super(MusteriAd,MusteriSoyad,MusteriNo);
        this.TelefonNo= TelefonNo;
    }
    public void BilgiGoster(){
        System.out.println("Şahıs Müşteri : ");
        super.BilgiGoster();
        System.out.println("Vergi no = " + TelefonNo);
        System.out.println();
    }

}
