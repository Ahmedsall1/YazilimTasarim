package observer;

public class Student implements Observers{
    String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(String massege) {
        System.out.println(this.name + " has new notification :" + massege);
    }
}
