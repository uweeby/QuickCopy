import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Load {
	private String[] FieldArray = new String[QuickCopy.TotalFields];
	
	public void LoadMethod() { 
        try{
            // Open template file
            FileInputStream fstream = new FileInputStream(QuickCopy.filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
           
            for (int i=0; i < QuickCopy.TotalFields; i++) {
                FieldArray[i] = br.readLine();  
            }
           
            //Close the input stream
            in.close();
            }catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
	}
	
	public String getField(int i) {
		return (FieldArray[i - 1]);
	}
}
