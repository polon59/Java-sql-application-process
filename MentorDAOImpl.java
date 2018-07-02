import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MentorDAOImpl implements MentorDAO {

    private PostgreSQLJDBC postgreSQLJDBC;
    private Connection connection;
    private String[] resultRow;
    private List<String[]> resultsTable;


    public MentorDAOImpl(){
        postgreSQLJDBC = new PostgreSQLJDBC();
        connection = postgreSQLJDBC.getConnection();

    }


    @Override
    public List<String[]> getMentorsFullNames() throws SQLException {

        resultsTable = new ArrayList<>();

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT first_name, last_name FROM mentors;" );

            while ( rs.next() ) {
                resultRow = new String[2];
                resultRow[0] = rs.getString("first_name");
                resultRow[1] = rs.getString("last_name");
                resultsTable.add(resultRow);
            }

        return resultsTable;
    }


    @Override
    public List<String[]> getMiskolcMentorsNicknames() throws SQLException{

        resultsTable = new ArrayList<>();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT id, city, nick_name FROM mentors WHERE city = 'Miskolc';" );

        while ( rs.next() ) {
            resultRow = new String[3];
            resultRow[0] = rs.getString("id");
            resultRow[1] = rs.getString("city");
            resultRow[2] = rs.getString("nick_name");
            resultsTable.add(resultRow);
        }

    return resultsTable;
    }
    
}