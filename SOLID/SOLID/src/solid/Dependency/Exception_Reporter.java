package solid.Dependency;

public class Exception_Reporter  {

    private IDdatabase database;

    public Exception_Reporter(IDdatabase database) {
        this.database = database;
    }
    
    public void reportException(Exception exception) {
        database.add(exception);
    }
}
