import java.util.List;
import java.sql.SQLException;



public interface ApplicantDAO {

    List<String[]> getFullTable() throws SQLException;
    
    List<String[]> getFullNameByFirstName() throws SQLException; // 3

    List<String[]> getFullNameByEmail() throws SQLException; // 4

    void addNewApplicant() throws SQLException; // 5.1

    List<String[]> getApplicantByApplicationCode() throws SQLException; // 5.2

    void updatePhoneNumberByName() throws SQLException; // 6

    void deleteApplicantByEmail() throws SQLException; // 7
}