package factorymethodpattern;

public interface IBankFactory {
    IBank getBank(String bankCode);
}
