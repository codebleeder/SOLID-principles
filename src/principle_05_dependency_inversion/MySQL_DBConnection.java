package principle_05_dependency_inversion;

public class MySQL_DBConnection implements DBConnection {
    public void connect(){
        System.out.println("MySQL db connected");
    }
}
