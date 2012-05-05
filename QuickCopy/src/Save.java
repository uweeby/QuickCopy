import java.io.BufferedWriter;
import java.io.FileWriter;

public class Save{
	private int TotalFields = 7;
	private String[] SaveArray = new String[TotalFields];
	private String filename;
	
	public Save (String file) {
		//Take in the filename to save the file from the main class
		filename = file;
	}
	
	public void SaveMethod() {
		try{
            // Create file
            FileWriter fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);
 
            out.write(SaveArray[1] + "\r\n");
            out.write(SaveArray[2] + "\r\n");
            out.write(SaveArray[3] + "\r\n");
            out.write(SaveArray[4] + "\r\n");
            out.write(SaveArray[5] + "\r\n");
            out.write(SaveArray[6] + "\r\n");
            
            //System.out.println(SaveArray[1]);
            
            //for (int i = 1; i < FieldArray.length; i++) {
           // 	out.write(FieldArray[i] + "\r\n");
            //}
            
            //Close the output stream
            out.close();
            }catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
	}
	
	public void setField(String field, int i) {
		//Take in the JTextField string and set it to a local array
		SaveArray[i] = field;
		//System.out.println(SaveArray[1]);
	}
	
	public void setFieldPath(String filepath) {
		//Take in the filename to save the file from the main class
		filename = filepath;
	}
}
