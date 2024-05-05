package design.pattern.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private Pay_stategy pay_stategy;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void setPay_stategy(Pay_stategy pay_stategy) {
        this.pay_stategy = pay_stategy;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int calculateTotel() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += ((Item) items).get_price();
        }
        return sum;
    }

    public void pay() {
        int emount = calculateTotel();
        pay_stategy.ipayment(emount);
    }
}
