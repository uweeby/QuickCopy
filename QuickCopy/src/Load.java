import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Load {
	
	//Variable Declaration
	private String[] FieldArray = new String[QuickCopy.TotalFields];
	
	/**
	 * Void method to access template file. This function is called
	 * at the start of the application. It will save the template data
	 * so it can be added to the UI.
	 */
	public void LoadMethod() { 
        try {
            // Open File Stream for template file
            FileInputStream fstream = new FileInputStream(QuickCopy.filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
           
            for (int i=0; i < QuickCopy.TotalFields; i++) {
                FieldArray[i] = br.readLine();  
            }
           
            //Close the File Stream
            in.close();
        } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
        }
	}
	
	/**
	 * Returns String[] FieldArray
	 */
	public String getField(int i) {
		return (FieldArray[i - 1]);
	}
}
