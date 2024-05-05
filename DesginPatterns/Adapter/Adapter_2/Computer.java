package design.pattern.Adapter;

public class Computer implements Divice {

    @Override
    public void screen() {
        System.out.println("your screen is a 30 inch asus");
    }

    @Override
    public void battery() {
        System.out.println("your battery is 11000 A");
    }

    @Override
    public void sound() {
        System.out.println("your sound is  logitech Z150 ");
    }

}
