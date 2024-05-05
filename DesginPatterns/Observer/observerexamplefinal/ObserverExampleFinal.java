 package observerexamplefinal;

public class ObserverExampleFinal {

    public static void main(String[] args) {
        
        Dikanlik dik=new Dikanlik();
        String Bildirim=" Hello";
        dik.ogrenci.add(new Ogrenci("Ahmed"));
        dik.ogrenci.add(new Ogrenci("Abdo"));
        dik.ogrenci.add(new Ogrenci("Hasan"));

        dik.sos.add(new Facebook());
        dik.sos.add(new Twitter());
        dik.sos.add(new Instagram());
        dik.sos.add(new Tiktok());
        dik.BildirimGonder(Bildirim);
        dik.BildirimGonder("fafsdfsdasdaasd");

    }

}
