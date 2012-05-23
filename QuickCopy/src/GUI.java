import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {
	
	private final JTextField textfield1;
	private final JTextField textfield2;
	private final JTextField textfield3;
	private final JTextField textfield4;
	private final JTextField textfield5;
	private final JTextField textfield6;
	
	private JButton copybutton1;
	private JButton copybutton2;
	private JButton copybutton3;
	private JButton copybutton4;
	private JButton copybutton5;
	private JButton copybutton6;
	private JButton savebutton;
	
	public JTextField[] fieldarray = new JTextField[QuickCopy.TotalFields];
	
	public GUI() {
		//GUi Constructor
		super("Quick Copy"); //Window Title
		setLayout(new FlowLayout());
		
        Load load = new Load();
        load.LoadMethod();
		
        //Setup textfield and copy button
		textfield1 = new JTextField(load.getField(1), 35);
		copybutton1 = new JButton("Copy");
		copyevent(copybutton1, textfield1);
		add(textfield1);
		add(copybutton1);
		
		//Setup textfield and copy button
		textfield2 = new JTextField(load.getField(2), 35);
		copybutton2 = new JButton("Copy");
		copyevent(copybutton2, textfield2);
		add(textfield2);
		add(copybutton2);
		
		//Setup textfield and copy button
		textfield3 = new JTextField(load.getField(3), 35);
		copybutton3 = new JButton("Copy");
		copyevent(copybutton3, textfield3);
		add(textfield3);
		add(copybutton3);
		
		//Setup textfield and copy button
		textfield4 = new JTextField(load.getField(4), 35);
		copybutton4 = new JButton("Copy");
		copyevent(copybutton4, textfield4);
		add(textfield4);
		add(copybutton4);
		
		//Setup textfield and copy button
		textfield5 = new JTextField(load.getField(5), 35);
		copybutton5 = new JButton("Copy");
		copyevent(copybutton5, textfield5);
		add(textfield5);
		add(copybutton5);
		
		//Setup textfield and copy button
		textfield6 = new JTextField(load.getField(6), 35);
		copybutton6 = new JButton("Copy");
		copyevent(copybutton6, textfield6);
		add(textfield6);
		add(copybutton6);
		
		savebutton = new JButton("Save");
		saveEvent();
		add(savebutton);
		
		fieldarray[0] = textfield1;
		fieldarray[1] = textfield2;
		fieldarray[2] = textfield3;
		fieldarray[3] = textfield4;
		fieldarray[4] = textfield5;
		fieldarray[5] = textfield6;
		
	}
	
	public void copyevent(JButton button, final JTextField field) {
		button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(field.getText());
            }
        });
	}
	
	public void saveEvent(){
		savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //What to do when save button is selected:
            	//Save the current values of all text fields to a file.
        	    Save save = new Save();
        	    
        	    for(int i = 0; i < QuickCopy.TotalFields; i++) {
        	    	save.setField(fieldarray[i], i);
        	    }
        	    save.toFile();
            }
        });
	}
}
