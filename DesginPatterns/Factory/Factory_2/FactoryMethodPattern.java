package factorymethodpattern;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        
        String bankcode="456";
        BankFactory factory = new BankFactory();
        IBank bank=factory.getBank(bankcode);

        System.out.println(bank.Withdraw());
    }
}
