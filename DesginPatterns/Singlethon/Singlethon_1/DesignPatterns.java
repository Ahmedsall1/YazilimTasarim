package designpatterns;

public class DesignPatterns {
    public static void main(String[] args) {
        
        Counter counter = Counter.GetInstace();
        counter.AddOne();

        Counter counter2 = Counter.GetInstace();
        counter2.AddOne();

        System.out.println(counter.count);
    }
}
