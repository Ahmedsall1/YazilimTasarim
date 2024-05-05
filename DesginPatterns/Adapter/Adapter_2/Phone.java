package design.pattern.Adapter;

public class Phone {
    public void touch() {
        System.out.println("your phone screen is samsung touch screen");
    }

    public void lithium_battery() {
        System.out.println("your battery is a lithium battery 4300 A");
    }

    public void phone_sound() {
        System.out.println("your phone sound is a samsung AKG");
    }
}
