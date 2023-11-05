public class FirmaMusteri extends Musteri{
    private int VergiNo;
    public int getVergiNo(){return VergiNo;}
    public void setVergiNo(int vergiNo){
        this.VergiNo=VergiNo;
    }

    public FirmaMusteri(String MusteriAd,String MusteriSoyad, int MusteriNo, int VergiNo){
        super(MusteriAd,MusteriSoyad,MusteriNo);
        this.VergiNo= VergiNo;
    }

    public void BilgiGoster(){
        System.out.println("Firma Müşteri : ");
        super.BilgiGoster();
        System.out.println("Vergi no = " + VergiNo);
    }


}
