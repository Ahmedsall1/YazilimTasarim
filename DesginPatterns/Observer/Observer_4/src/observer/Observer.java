package observer;

public class Observer {

    public static void main(String[] args) {
        

        Student ali = new Student("ali");
        Student hayan = new Student("hayan");
        Student halid = new Student("halid");
        Student ahmet = new Student("ahmet");
        Student semir = new Student("semir");

        Course java = new Course("java Course");

        java.subscribe(semir);
        java.subscribe(ali);
        java.subscribe(halid);
        java.subscribe(hayan);
        java.subscribe(ahmet);

        java.unsubscribe(ahmet);

        java.setAvailability(false);
    }
    
}
