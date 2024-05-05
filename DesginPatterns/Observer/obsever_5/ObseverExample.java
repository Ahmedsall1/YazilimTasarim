package obseverexample;

public class ObseverExample {

    public static void main(String[] args) {
        
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}