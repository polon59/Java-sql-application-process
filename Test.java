/**
 * Test
 */
import java.util.List;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        View display = new View();
        MentorDAOImpl mentorDAOImpl = new MentorDAOImpl();
        

        try {
        List<String[]> mentorsFullNames = mentorDAOImpl.getMentorsFullNames();
        display.displayResultTable(mentorsFullNames);

        List<String[]> miskolcNicknames = mentorDAOImpl.getMiskolcMentorsNicknames();
        display.displayResultTable(miskolcNicknames);

        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }
}