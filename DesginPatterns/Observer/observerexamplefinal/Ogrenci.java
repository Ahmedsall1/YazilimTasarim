package observerexamplefinal;

public class Ogrenci {
    
    public String adi;
    public Ogrenci(String adi) {
        this.adi = adi; 
    }
    public String bildirimAl(){
        return adi+" Bildirim aldi ";
    }
}
