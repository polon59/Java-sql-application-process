/**
 * Test
 */
import java.util.List;

public class Test {

    public static void main(String[] args) {
        View display = new View();
        MentorDAOImpl mentorDAOImpl = new MentorDAOImpl();
        
        List<String[]> mentorsFullNames = mentorDAOImpl.getMentorsFullNames();
        display.displayResult(mentorsFullNames);
    }
}