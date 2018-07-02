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


    public MentorDAOImpl(){
        postgreSQLJDBC = new PostgreSQLJDBC();
        connection = postgreSQLJDBC.getConnection();
    }


    @Override
    public List<String[]> getMentorsFullNames() throws SQLException {

        String[] row;
        List<String[]> results = new ArrayList<>();

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT first_name, last_name FROM mentors;" );

            while ( rs.next() ) {
                row = new String[2];
                row[0] = rs.getString("first_name");
                row[1] = rs.getString("last_name");
                results.add(row);
            }

            rs.close();
            stmt.close();
            connection.close();

        return results;
    }


    // @Override
    // public List<String[]> getMiskolcMentorsNicknames(){

    // }
    
}