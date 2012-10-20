import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JTextField;

public class Save {
	
	//Variable Declaration
	private String[] SaveArray = new String[QuickCopy.TotalFields];
	
	/**
	 * Void method to access template file. It will overwrite the file
	 * with the current user provided data to be saved.
	 */
	public void toFile() {
		try{
            // Open File Stream. Create file
            FileWriter fstream = new FileWriter(QuickCopy.filename);
            BufferedWriter out = new BufferedWriter(fstream);
 
            //Write all fields to textfile
            for (int i = 0; i < QuickCopy.TotalFields; i++) {
            	out.write(SaveArray[i] + "\r\n");
            }
            
            //Close the File Stream
            out.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public void setField(JTextField field, int i) {
		//Take parameter field and set it to a private String array SaveArray
		SaveArray[i] = field.getText();
	}
}
