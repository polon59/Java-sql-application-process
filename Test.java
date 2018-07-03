/**
 * Test
 */
import java.util.List;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        View display = new View();
        MentorDAOImpl mentorDAOImpl = new MentorDAOImpl();
        ApplicantDAOImpl applicantDAOImpl = new ApplicantDAOImpl();
        

        try {
        List<String[]> mentorsFullNames = mentorDAOImpl.getMentorsFullNames();
        display.displayResultTable(mentorsFullNames);

        List<String[]> miskolcNicknames = mentorDAOImpl.getMiskolcMentorsNicknames();
        display.displayResultTable(miskolcNicknames);

        List<String[]> applicantsTable = applicantDAOImpl.getFullTable();
        display.displayResultTable(applicantsTable);

        List<String[]> fullNameByFirstName =applicantDAOImpl.getFullNameByFirstName();
        display.displayResultTable(fullNameByFirstName);
        
        List<String[]> fullNameByEmail = applicantDAOImpl.getFullNameByEmail();
        display.displayResultTable(fullNameByEmail);

        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }
}