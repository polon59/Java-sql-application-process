/**
 * MentorDAO
 */
import java.util.List;
import java.sql.SQLException;

public interface MentorDAO {
    
    List<String[]> getMentorsFullNames() throws SQLException;

    //List<String[]> getMiskolcMentorsNicknames() throws SQLException;
}