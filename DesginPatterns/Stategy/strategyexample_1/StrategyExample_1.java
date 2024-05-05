package strategyexample_1;

public class StrategyExample_1 {

    public static void main(String[] args) {

        final Bean bean = new Bean();
        bean.setCounter(10);
        bean.setName("name");
        FileManager.instance().saveBean(bean);
    }

}
