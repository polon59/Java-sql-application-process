import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {

    private Connection connection;

    public PostgreSQLJDBC(){
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SI_1", "pp1", "Polon59"); // set user and password  
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        }
    

    public Connection getConnection() {

        return connection;
        
    }
}