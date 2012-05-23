import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JTextField;

public class Save{
	private String[] SaveArray = new String[QuickCopy.TotalFields];
	
	public void toFile() {
		try{
            // Create file
            FileWriter fstream = new FileWriter(QuickCopy.filename);
            BufferedWriter out = new BufferedWriter(fstream);
 
            //Write all fields to textfile
            for (int i = 0; i < QuickCopy.TotalFields; i++) {
            	out.write(SaveArray[i] + "\r\n");
            }
            
            //Close the output stream
            out.close();
            }catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
	}
	
	public void setField(JTextField field, int i) {
		//Take in the JTextField and set it to a local array
		SaveArray[i] = field.getText();
	}
}
