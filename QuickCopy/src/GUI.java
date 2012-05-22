import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {
	
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;
	
	private JButton copybutton1;
	private JButton copybutton2;
	private JButton copybutton3;
	private JButton copybutton4;
	private JButton copybutton5;
	private JButton copybutton6;
	
	private JButton savebutton;
	
	public GUI() {
		super("Quick Copy");
		setLayout(new FlowLayout());
		
        Load load = new Load(QuickCopy.filename);
        load.LoadMethod();
		
		textfield1 = new JTextField(load.getField(1), 35);
		add(textfield1);
		copybutton1 = new JButton("Copy");
		copybutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(textfield1.getText());
            }
        });
		add(copybutton1);
		
		textfield2 = new JTextField(load.getField(2), 35);
		add(textfield2);
		copybutton2 = new JButton("Copy");
		copybutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(textfield2.getText());
            }
        });
		add(copybutton2);
	
		textfield3 = new JTextField(load.getField(3), 35);
		add(textfield3);
		copybutton3 = new JButton("Copy");
		copybutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(textfield3.getText());
            }
        });
		add(copybutton3);
		
		textfield4 = new JTextField(load.getField(4), 35);
		add(textfield4);
		copybutton4 = new JButton("Copy");
		copybutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(textfield4.getText());
            }
        });
		add(copybutton4);
		
		textfield5 = new JTextField(load.getField(5), 35);
		add(textfield5);
		copybutton5 = new JButton("Copy");
		copybutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(textfield5.getText());
            }
        });
		add(copybutton5);
		
		textfield6 = new JTextField(load.getField(6), 35);
		add(textfield6);
		copybutton6 = new JButton("Copy");
		copybutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//Create clipboard object and paste the value of the TextField
        		ToClipboard toclipboard = new ToClipboard();
        		toclipboard.copyfrom(textfield6.getText());
            }
        });
		add(copybutton6);
		
		savebutton = new JButton("Save");
		savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //What to do when save button is selected:
            	//Save the current values of all text fields to a file.
        	    Save save = new Save(QuickCopy.filename);
        	    save.setField(textfield1.getText(), 1);
        	    save.setField(textfield2.getText(), 2);
        	    save.setField(textfield3.getText(), 3);
        	    save.setField(textfield4.getText(), 4);
        	    save.setField(textfield5.getText(), 5);
        	    save.setField(textfield6.getText(), 6);
        	    save.toFile();
            }
        });
		add(savebutton);
	}
	
	public void LoadGUI() {
		//Load previous template values from file.
    	//If no file exists give error that one must first be saved.
        Load load = new Load(QuickCopy.filename);
        load.LoadMethod();
        textfield1.setText(load.getField(1));
        textfield1.setText(load.getField(2));
        textfield1.setText(load.getField(3));
        textfield1.setText(load.getField(4));
        textfield1.setText(load.getField(5));
        textfield1.setText(load.getField(6));
	}
}
