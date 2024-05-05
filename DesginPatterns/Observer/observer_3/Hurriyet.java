package observerexample_3;

import java.util.ArrayList;

public class Hurriyet implements Gazete {

    // Aboneleri tutmak için bir ArrayList tanımlıyoruz.

    private ArrayList<Abone> aboneler = new ArrayList<Abone>();

    @Override
    public void aboneEkle(final Abone abone) {  getAboneler().add(abone); }

    @Override
    public void aboneSil(final Abone abone) {  getAboneler().remove(abone); }

    @Override
    public void gazeteGonder() {
        for (int i = 0; i < getAboneler().size(); i++) {
            getAboneler().get(i).update();
        }
    }
    public ArrayList<Abone> getAboneler() {  return aboneler; }

    public void setAboneler(final ArrayList<Abone> aboneler) {
        this.aboneler = aboneler;
    }
}
