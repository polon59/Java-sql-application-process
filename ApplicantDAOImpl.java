import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApplicantDAOImpl implements ApplicantDAO {

    private PostgreSQLJDBC postgreSQLJDBC;
    private Connection connection;
    private String[] resultRow;
    private List<String[]> resultsTable;


    public ApplicantDAOImpl(){
        postgreSQLJDBC = new PostgreSQLJDBC();
        connection = postgreSQLJDBC.getConnection();

    }


    @Override
    public List<String[]> getFullTable() throws SQLException{
        resultsTable = new ArrayList<>();
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM applicants;" );

        while ( rs.next() ) {
            resultRow = new String[5];
            resultRow[0] = rs.getString("first_name");
            resultRow[1] = rs.getString("last_name");
            resultRow[2] = rs.getString("phone_number");
            resultRow[3] = rs.getString("email");
            resultRow[4] = rs.getString("application_code");
            resultsTable.add(resultRow);
        }

        return resultsTable;
    }


    @Override
    public List<String[]> getFullNameByFirstName() throws SQLException{
        resultsTable = new ArrayList<>();
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT first_name ||' '|| last_name as full_name, phone_number FROM applicants WHERE first_name = 'Carol';" );

        while ( rs.next() ) {
            resultRow = new String[2];
            resultRow[0] = rs.getString("full_name");
            resultRow[1] = rs.getString("phone_number");
            resultsTable.add(resultRow);
        }

        return resultsTable;
    }


    @Override
    public List<String[]> getFullNameByEmail() throws SQLException{
        resultsTable = new ArrayList<>();
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT first_name ||' '|| last_name as full_name, email FROM applicants WHERE email LIKE  '%@adipiscingenimmi.edu';" );

        while ( rs.next() ) {
            resultRow = new String[2];
            resultRow[0] = rs.getString("full_name");
            resultRow[1] = rs.getString("email");
            resultsTable.add(resultRow);
        }

        return resultsTable;
    }


    @Override
    public void addNewApplicant() throws SQLException{
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "INSERT INTO applicants (first_name, last_name, phone_number, email, application_code)VALUES ('Markus','Schaffarzyk', '003620/725-2666','djnovus@groovecoverage.com',54823);" );
        
    }
    
}