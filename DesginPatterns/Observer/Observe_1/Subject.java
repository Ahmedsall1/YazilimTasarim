package design.pattern.Observes;

public interface Subject {
    
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

    public void setUpdate(String article);
    public String getUpdate();

}
