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

    public List<String[]> getFullTable() throws SQLException{
        resultsTable = new ArrayList<>();
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM applicants;" );

        while ( rs.next() ) {
            resultRow = new String[5];
            resultRow[0] = rs.getString("first_name");
            resultRow[1] = rs.getString("last_name");
            resultRow[2] = rs.getString("phone_number");
            resultRow[1] = rs.getString("email");
            resultRow[1] = rs.getString("application_code");
            resultsTable.add(resultRow);
        }

        return resultsTable;
    }
}