package observerexamplefinal;

public class Twitter implements SosyalMadya{
    
    @Override
    public void BildirimGonder(Ogrenci O, String Bilidirm) {
        System.out.println(UygulamaAdi()+Bilidirm+O.bildirimAl());
    }

    @Override
    public String UygulamaAdi() {
        return "Twitter";
    }
}
