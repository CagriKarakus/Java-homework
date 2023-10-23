import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    private static final ArrayList<Kullanici> kullanicilar = new ArrayList<>();

    public static void main(String[] args) {
        anaMenu();
    }
    private static void anaMenu(){
        out.println("Kullanıcı Eklemek için 1");
        out.println("Kullanıcılari Listelemek için 2");
        out.println("Tüm Şarkıları Listelemek için 3");
        out.println("Şarkı aramak için 4");

        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();

        if(input == 1){
            kullaniciEkle();
        }else if(input == 2){
            kullanicilariListele();
        }else if(input == 3){
            tumKullanicilarinSarkilari();
        }else if(input == 4){
            sarkiAra();
        }
    }


    private static void kullaniciEkle(){
        out.println("Kullanıcı Adını yazınız:");
        Scanner adScanner = new Scanner(in);
        String ad = adScanner.nextLine();

        out.println("Kullanıcı Soyadını yazınız:");
        Scanner soyadScanner = new Scanner(in);
        String soyad = soyadScanner.nextLine();

        Kullanici yeniKullanici = new Kullanici(ad,soyad);
        kullanicilar.add(yeniKullanici);

        out.println("Ana menuye dönmek için bir tuşa basın");

        anaMenu();

    }
    private static void kullanicilariListele(){

        for (int i = 1; i < kullanicilar.size()+1; i++) {
            out.println(i + ".Kullanıcı: " + kullanicilar.get(i-1).getAd() + " " + kullanicilar.get(i-1).getSoyad());
        }

        out.println("Seçmek istediğiniz kullanıcı idsini giriniz");

        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();

        Kullanici secilenKullanici = kullanicilar.get(input-1);

        kullaniciDetaylari(secilenKullanici);
    }

    private static void kullaniciDetaylari(@NotNull Kullanici kullanici){           // NotNull u IDE yaptı ne olduğunu bilmiyorum.
        out.println("Seçilen Kullanıcı: " + kullanici.getAd() + " " + kullanici.getSoyad());

        kullanici.sarkiListele();

        if(kullanici.getSarkiKoleksiyonu().getSarkilar().isEmpty()){
            out.println("Seçilen kullanıcıya ait herhangi bir şarkı bulunamadı");
        }

        Scanner menu = new Scanner(in);

        out.println("Şarkı eklemek için 1");
        out.println("Şarkı silmek için 2");
        out.println("Ana menüye dönmek için 3");

        int input = menu.nextInt();
        if(input == 1){
            kullanici.sarkiEkle(kullaniciyaSarkiEkle());
            kullaniciDetaylari(kullanici);
        }else if(input == 2){
            if(kullanici.getSarkiKoleksiyonu().getSarkilar().isEmpty()){
                out.println("Seçilen kullanıcıya ait herhangi bir şarkı bulunamadı");
                kullaniciDetaylari(kullanici);
            }else{
                out.println("Şarkı adı giriniz:");

                Scanner menu2 = new Scanner(in);
                String input2 = menu2.nextLine();

                for (Sarki sarki :kullanici.getSarkiKoleksiyonu().getSarkilar()){
                    if(sarki.getAd().equals(input2)){
                        kullanici.sarkiKaldir(sarki);
                        out.println("Şarkı başarıyla silindi anamenüye dönülüyor");
                        anaMenu();
                        return;
                    }
                }
            }

        }else if(input == 3){
            anaMenu();
        }
    }

    @Contract(" -> new")                                                                // Hocam sarı yerleri IDE yaptı ben bilmiyorum.
    private static @NotNull Sarki kullaniciyaSarkiEkle(){
        Scanner sarki = new Scanner(in);

        out.println("Şarkı Adı Giriniz");
        String sarkiAdi =sarki.nextLine();

        out.println("Album Adı Giriniz");
        String albumAdi =sarki.nextLine();

        out.println("Sanatçı Adı Giriniz");
        String sanatciAdi =sarki.nextLine();

        out.println("Süre saniye cinsinden Giriniz");
        int sure =sarki.nextInt();

        return new Sarki(sarkiAdi, albumAdi,sanatciAdi,sure);
    }
    private static void tumKullanicilarinSarkilari(){

        int sarkiSayisi = 0;
        int toplamSure = 0;
        for (Kullanici kullanici : kullanicilar){
            for (Sarki sarki : kullanici.getSarkiKoleksiyonu().getSarkilar()){
                sarkiSayisi++;
                out.println("Şarkı: " + sarki.getAd() + " Album: "+ sarki.getAlbum() + " Sanatçı: " + sarki.getSanatci() + " Süre: " + sarki.getSure() + " sn");
                toplamSure += sarki.getSure();
            }
        }

        if(sarkiSayisi == 0){
            out.println("Şarkı Bulunamadı");
            anaMenu();
        }
        else  {
            out.println("Toplam Şarkı Sayısı = "+ sarkiSayisi + "Şarkıların toplam süresi = "+ toplamSure);
            anaMenu();
        }
    }

    private static void sarkiAra(){

      Scanner scn = new Scanner(in);
      out.println("Lütfen aranacak şarkıyı giriniz = ");
      String aranacakSarki = scn.nextLine();
      int n=0;
      for (Kullanici kullanici : kullanicilar){
          for (Sarki sarki : kullanici.getSarkiKoleksiyonu().getSarkilar()){
              if(sarki.getAd().equals(aranacakSarki)){
                  System.out.println("Şarkı: " + sarki.getAd() + " Album: "+ sarki.getAlbum() + " Sanatçı: " + sarki.getSanatci() + " Süre: " + sarki.getSure() + " sn");
                  n=1;
              }
          }
      }
      if(n==0){
          out.println("Aranan şarkı şarkı koleksiyonunda bulunamadı");
      }
        anaMenu();
    }

}
