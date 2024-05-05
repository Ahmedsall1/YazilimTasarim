package observer;

public interface Subject {
    void subscribe(Observers observer);
    void unsubscribe(Observers observer);
    void notifyAllSubscibers();
}
