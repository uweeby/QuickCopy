import javax.swing.JFrame;

public class QuickCopy {
	
	public static String filename = "template.txt";
	
	public static void main(String[] args) {
		
		GUI guiObject = new GUI();
		guiObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiObject.setSize(500,500);
		guiObject.setVisible(true);
		
	}
}
