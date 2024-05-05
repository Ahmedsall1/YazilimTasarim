package factorymethodpattern;

public class BankFactory implements IBankFactory{
    
    public IBank getBank(String bankCode){
        switch(bankCode){
            case "123": return new Kuvvet();
            case "456": return new Ziraat();
        }
        return null;
    }
}
