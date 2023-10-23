import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class MuzikKoleksiyonu{
    private static ArrayList<Sarki> sarkilar;

    public MuzikKoleksiyonu() {
        sarkilar = new ArrayList<>();
    }

    public ArrayList<Sarki> getSarkilar() {
        return sarkilar;
    }

    public static int toplamSure() {
        int toplam = 0;
        for (Sarki sarki : sarkilar) {
            toplam += sarki.getSure();
        }
        return toplam;
    }

    public Sarki sarkiAra(String sarkiAdi){
        for (Sarki sarki : sarkilar){
            if (sarki.getAd().equals(sarkiAdi)){
                return sarki;
            }

        }
        return null;
    }

}




