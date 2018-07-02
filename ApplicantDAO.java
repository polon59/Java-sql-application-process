import java.util.List;
import java.sql.SQLException;



public interface ApplicantDAO {

    List<String[]> getFullTable() throws SQLException;
    
    List<String[]> getFullNameByLastName() throws SQLException;

    List<String[]> getFullNameByEmail() throws SQLException;
}