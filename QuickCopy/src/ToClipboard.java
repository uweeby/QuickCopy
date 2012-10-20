import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ToClipboard {
	/**
	 * Void method to copy a string to the environment clipboard. 
	 * This will be used to paste into the document for quick access.
	 * 
	 * @param	string	string to be added to clipboard
	 */
	public void copyfrom(String copyfrom) {
		   StringSelection strsel = new StringSelection(copyfrom);
		   Clipboard clbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		   clbrd.setContents(strsel, strsel);
	}
}