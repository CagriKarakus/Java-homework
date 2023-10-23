public class Sarki {
    private String ad;
    private String album;
    private String sanatci;
    private int sure; // Şarkının süresi saniye cinsinden

    public Sarki(String ad, String album, String sanatci, int sure) {
        this.ad = ad;
        this.album = album;
        this.sanatci = sanatci;
        this.sure = sure;
    }

    public String getAd() {
        return ad;
    }

    public String getAlbum() {
        return album;
    }

    public String getSanatci() {
        return sanatci;
    }

    public int getSure() {
        return sure;
    }
}
