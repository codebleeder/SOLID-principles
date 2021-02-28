package principle_05_dependency_inversion;

public class MongoDBConnection implements DBConnection {
    public void connect(){
        System.out.println("Mongo db connected");
    }
}
