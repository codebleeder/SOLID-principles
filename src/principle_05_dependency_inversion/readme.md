# Dependency Inversion

* Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
* if you follow open-closed principle and Liskov substitution principle, then Dependency inversion is automatically followed.

Example: 
Assuming you have a backend controller that needs to connect to a database. 

So you write MySQLConnection and PasswordReminder:
```
class MySQLConnection
{
    public function connect()
    {
        // handle the database connection
        return 'Database connection';
    }
}

class PasswordReminder
{
    private $dbConnection;

    public function __construct(MySQLConnection $dbConnection)
    {
        $this->dbConnection = $dbConnection;
    }
}
```

Here PasswordReminder depends on concrete class MySQLConnection. 
In future if the backend wants to connect to MongoDB connection, then PasswordReminder is tightly coupled with MySQLConnection.

To address the above problem, you introduce an interface "DBConnectionInterface" to connect to databases and use 
