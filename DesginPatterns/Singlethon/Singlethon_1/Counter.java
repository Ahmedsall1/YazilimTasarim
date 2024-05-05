package designpatterns;

public class Counter {

    public static int count=0;
    
    private static Counter instance = null;

    private Counter(){}

    public static Counter GetInstace(){
        if(instance==null){instance=new Counter();}
        return instance;
    }
    public void AddOne(){count++;}
}