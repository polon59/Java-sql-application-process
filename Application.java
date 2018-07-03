import java.util.Scanner;
import java.sql.SQLException;

public class Application {
    Scanner input;
    View display;
    MentorDAOImpl mentorDAOImpl;
    ApplicantDAOImpl applicantDAOImpl;

    public Application(){
        input = new Scanner(System.in);
        display = new View();
        mentorDAOImpl = new MentorDAOImpl();
        applicantDAOImpl = new ApplicantDAOImpl();
    }


    public void handleApplication(){
        int currentOption = 10;
        //clear screen
        
        
        while(currentOption != 0){

            //display main menu options
            currentOption = input.nextInt(); input.nextLine();

        try {
            switch(currentOption){
                case 1:
                    List<String[]> mentorsFullNames = mentorDAOImpl.getMentorsFullNames();
                    display.displayResultTable(mentorsFullNames);
                    break;
                case 2:
                    List<String[]> miskolcNicknames = mentorDAOImpl.getMiskolcMentorsNicknames();
                    display.displayResultTable(miskolcNicknames);
                    break;
                case 3:
                    List<String[]> applicantsTable = applicantDAOImpl.getFullTable();
                    display.displayResultTable(applicantsTable);
                    break;
                case 4:
                    List<String[]> fullNameByFirstName =applicantDAOImpl.getFullNameByFirstName();
                    display.displayResultTable(fullNameByFirstName);
                    break;
                case 5:
                    List<String[]> fullNameByEmail = applicantDAOImpl.getFullNameByEmail();
                    display.displayResultTable(fullNameByEmail);
                    break;
                case 6:
                    applicantDAOImpl.addNewApplicant();
                    List<String[]> fullApplicantInfo = applicantDAOImpl.getApplicantByApplicationCode();
                    display.displayResultTable(fullApplicantInfo);
                    break;
                case 7:
                    applicantDAOImpl.updatePhoneNumberByName();
                    break;
                case 8:
                    applicantDAOImpl.deleteApplicantByEmail();
                    break; 
            }
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
            
        }
    }
}