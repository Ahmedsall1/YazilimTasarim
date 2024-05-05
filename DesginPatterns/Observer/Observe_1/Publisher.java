package design.pattern.Observes;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

    private List<Observer> observers;
    private String article;

    public Publisher(){
        observers = new ArrayList<>();
        
    }

    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
    }
    }

    @Override
    public String getUpdate(){
        return article;
    }
    @Override
    public void setUpdate(String article){
        this.article = article;
        notifyObservers();
    }
    
}


