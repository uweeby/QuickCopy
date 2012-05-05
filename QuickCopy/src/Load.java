import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Load {
	private int TotalFields = 6;
	private String[] FieldArray = new String[TotalFields];
	private String filename;
	
	public Load (String file) {
		//Take in the filename to load from the main class
		filename = file;
	}
	
	public void LoadMethod() {
		
	       
        try{
            // Open template file
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
           
            for (int i=0; i < TotalFields; i++) {
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
