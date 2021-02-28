package principle_05_dependency_inversion;

public class PasswordReminder {
    private DBConnection dbConnection;

    public PasswordReminder(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public void remind(){
        this.dbConnection.connect();
        System.out.println("password reminder");
    }
}
