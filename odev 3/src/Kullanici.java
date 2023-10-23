import java.util.ArrayList;

public class Kullanici {
    private String ad;
    private String soyad;
    private MuzikKoleksiyonu sarkiKoleksiyonu;

    public Kullanici(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.sarkiKoleksiyonu = new MuzikKoleksiyonu();
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public MuzikKoleksiyonu getSarkiKoleksiyonu() {
        return sarkiKoleksiyonu;
    }

    public void sarkiEkle(Sarki sarki){
        sarkiKoleksiyonu.getSarkilar().add(sarki);
    }

    public void sarkiListele(){
        int toplamSure =0;
        for (Sarki sarki : sarkiKoleksiyonu.getSarkilar()) {
            System.out.println("Şarkı: " + sarki.getAd() + " Album: "+ sarki.getAlbum() + " Sanatçı: " + sarki.getSanatci() + " Süre: " + sarki.getSure() + " sn");
            toplamSure += sarki.getSure();
            System.out.println("Şarkıların toplam süresi = "+ toplamSure);
        }
    }

    public ArrayList<Sarki> sarkiAra(String sarkiAdi){

        ArrayList <Sarki> bulunanSarkilar = new ArrayList<>();

        for (Sarki sarki : sarkiKoleksiyonu.getSarkilar()){
            if(sarki.getAd().contains(sarkiAdi)){
                bulunanSarkilar.add(sarki);
            }
        }

        return bulunanSarkilar;
    }
    public void sarkiKaldir(Sarki sarki){
        sarkiKoleksiyonu.getSarkilar().remove(sarki);
    }
}
