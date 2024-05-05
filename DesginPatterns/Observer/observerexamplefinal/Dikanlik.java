package observerexamplefinal;

import java.util.ArrayList;

public class Dikanlik implements Observer {

    public ArrayList<Ogrenci> ogrenci = new ArrayList<>();
    public ArrayList<SosyalMadya> sos = new ArrayList<>();

    @Override
    public void BildirimGonder(String Bildirim) {
        for (SosyalMadya s : sos) {
            for (Ogrenci c : ogrenci) {
                s.BildirimGonder(c, Bildirim);
            }
        }
    }

}