public class Main {
    public static void main(String[] args) {
        SahisMusteri sahisMusteri = new SahisMusteri("Cagri","Karakus",25,123);
        FirmaMusteri firmaMusteri = new FirmaMusteri("Kanye","West",45,323);

        sahisMusteri.BilgiGoster();
        firmaMusteri.BilgiGoster();

    }
}