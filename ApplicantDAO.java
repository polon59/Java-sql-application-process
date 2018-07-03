import java.util.List;
import java.sql.SQLException;



public interface ApplicantDAO {

    List<String[]> getFullTable() throws SQLException;
    
    List<String[]> getFullNameByFirstName() throws SQLException; // 3

    List<String[]> getFullNameByEmail() throws SQLException; // 4

    //void addNewApplicant() throws SQLException; // 5

//     void updatePhoneNumberByName() throws SQLException;

//     void getRowByName() throws SQLException;
}