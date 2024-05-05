package design.pattern.Strategy;

public class CreditCardPayment implements Pay_stategy {
    private String name;
    private String cardName;
    private String CVV;
    private String dataOfExpiry;

    public CreditCardPayment(String name, String cardName, String CVV, String dataOfExpiry) {
        this.name = name;
        this.cardName = cardName;
        this.CVV = CVV;
        this.dataOfExpiry = dataOfExpiry;
    }

    public void ipayment(int amount) {
        System.out.println(" piad by credit card ");
    }

    public String getName() {  return name; }

    public void setName(String name) {  this.name = name; }

    public String getCardName() {  return cardName; }

    public void setCardName(String cardName) {  this.cardName = cardName; }

    public String getCVV() {  return CVV; }

    public void setCVV(String CVV) {this.CVV = CVV; }

    public String getDataOfExpiry() {  return dataOfExpiry; }

    public void setDataOfExpiry(String dataOfExpiry) {
        this.dataOfExpiry = dataOfExpiry;
    }

}
