package design.pattern.Adapter;

public class PhoneAdabter implements Divice {

    private Phone phone;

    public PhoneAdabter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void screen() {
        this.phone.touch();
    }

    @Override
    public void battery() {
        this.phone.lithium_battery();
    }

    @Override
    public void sound() {
        this.phone.phone_sound();
    }

}
