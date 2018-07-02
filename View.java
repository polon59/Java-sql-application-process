/**
 * View
 */

 import java.sql.ResultSet;
 import java.util.List;

public class View {

    public void displayResult(List<String[]> result){

        for(String[] row : result){

            for (String dataPiece : row){
                System.out.print(dataPiece);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}