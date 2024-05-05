package design.pattern.Observes;

public class Reader implements Observer {
    private String article;
    private Subject sub;

    public Reader( Subject blog){
        article = "article";
        sub = blog;
        sub.addObserver(this);
    }

    @Override
    public void update(){
        article = sub.getUpdate();
        System.out.println("You : " + article);
    }

    
    
}
