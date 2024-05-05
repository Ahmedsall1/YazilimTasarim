package observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
    public String name;
    public String availability;
    private List<Observers> observerList;

    public Course(String name) {
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observers observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observers observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscibers() {
        for (Observers observer : observerList) {
            observer.update(availability);
        }
    }

    public void setAvailability(boolean available) {
        availability = this.name + (available ? " available " : " not available ");
        notifyAllSubscibers();
    }
}
