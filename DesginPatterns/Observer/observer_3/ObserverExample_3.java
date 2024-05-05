package observerexample_3;

public class ObserverExample_3 {
    public static void main(String[] args) {

        final Gazete hurriyet = new Hurriyet();
        final Abone musteri1 = new Musteri("Tarik", "Akan");
        musteri1.aboneOl(hurriyet);
        final Abone musteri2 = new Musteri("Filiz", "Akin");
        musteri2.aboneOl(hurriyet);
        hurriyet.gazeteGonder();
        musteri2.aboneligiIptalEt();
        hurriyet.gazeteGonder();
    }
}
