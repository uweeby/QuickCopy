import javax.swing.JFrame;

public class QuickCopy {
	
	//Variable Declaration:
	public static String filename = "template.txt";
	public static int TotalFields = 6;
	
	//Main Method
	public static void main(String[] args) {
		
		//Create and setup GUI
		GUI guiObject = new GUI();
		guiObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiObject.setSize(500,300);
		guiObject.setVisible(true);
	}
}
