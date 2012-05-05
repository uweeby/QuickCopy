import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ToClipboard {
	public void copyfrom(String copyfrom) {
		   StringSelection strsel = new StringSelection(copyfrom);
		   Clipboard clbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		   clbrd.setContents(strsel, strsel);
	}

}