package design.pattern.Factory;

public class Sandwich_factory {
    public static final int CHEESE_BURGER = 1;
    public static final int CHICKEN_BURGER = 2;

    public static Sandwich createSandwich(int sanswich_id) {
        switch (sanswich_id) {
            case CHEESE_BURGER:
                return new Cheese_burger();
            case CHICKEN_BURGER:
                return new Chicken_burger();
            default:
                return null;
        }
    }
}
