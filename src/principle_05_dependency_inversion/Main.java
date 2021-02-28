package principle_05_dependency_inversion;

class Main {
    public static void main(String[] args) {
        MySQL_DBConnection mySQL_dbConnection = new MySQL_DBConnection();
        MongoDBConnection mongoDBConnection = new MongoDBConnection();
        PasswordReminder mysqlPR = new PasswordReminder(mySQL_dbConnection);
        mysqlPR.remind();

        PasswordReminder mongoPR = new PasswordReminder(mongoDBConnection);
        mongoPR.remind();
    }
}
