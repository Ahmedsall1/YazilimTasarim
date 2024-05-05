package design.pattern.Strategy;

public class PaypalPayment implements Pay_stategy {
    private String _email;
    private String _password;

    public PaypalPayment(String email, String password) {
        _email = email;
        _password = password;
    }

    @Override
    public void ipayment(int amount) {
        System.out.println("pida by paypal ");
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

}
