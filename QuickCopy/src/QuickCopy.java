/*
 * Quick Copy - Application to speed up the process of copy/pasting similar
 * texts. Primarily for my day job as a Help Desk Tech.
 */
public class QuickCopy extends javax.swing.JFrame {
	//This file is where the template text will be saved.
	public static String filename = "template.txt";
	
	private javax.swing.JButton LoadTemplateBUTTON;
    private javax.swing.JButton SaveTemplateBUTTON;
    public static javax.swing.JTextField TextField1;
    public static javax.swing.JTextField TextField2;
    public static javax.swing.JTextField TextField3;
    public static javax.swing.JTextField TextField4;
    public static javax.swing.JTextField TextField5;
    public static javax.swing.JTextField TextField6;
    private javax.swing.JButton copyField1;
    private javax.swing.JButton copyField2;
    private javax.swing.JButton copyField3;
    private javax.swing.JButton copyField4;
    private javax.swing.JButton copyField5;
    private javax.swing.JButton copyField6;
	
    public QuickCopy() {
        initComponents();
    }
 
    private void initComponents() {
 
        TextField1 = new javax.swing.JTextField();
        copyField1 = new javax.swing.JButton();
        TextField2 = new javax.swing.JTextField();
        copyField2 = new javax.swing.JButton();
        TextField3 = new javax.swing.JTextField();
        copyField3 = new javax.swing.JButton();
        TextField4 = new javax.swing.JTextField();
        copyField4 = new javax.swing.JButton();
        TextField5 = new javax.swing.JTextField();
        copyField5 = new javax.swing.JButton();
        TextField6 = new javax.swing.JTextField();
        copyField6 = new javax.swing.JButton();
        SaveTemplateBUTTON = new javax.swing.JButton();
        LoadTemplateBUTTON = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        TextField1.setText("1");
 
        copyField1.setText("Copy");
        copyField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyField1ActionPerformed(evt);
            }
        });
 
        TextField2.setText("2");
 
        copyField2.setText("Copy");
        copyField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyField2ActionPerformed(evt);
            }
        });
 
        TextField3.setText("3");
 
        copyField3.setText("Copy");
        copyField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyField3ActionPerformed(evt);
            }
        });
 
        TextField4.setText("4");
 
        copyField4.setText("Copy");
        copyField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyField4ActionPerformed(evt);
            }
        });
 
        TextField5.setText("5");
 
        copyField5.setText("Copy");
        copyField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyField5ActionPerformed(evt);
            }
        });
 
        TextField6.setText("6");
 
        copyField6.setText("Copy");
        copyField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyField6ActionPerformed(evt);
            }
        });
 
        SaveTemplateBUTTON.setText("Save Template");
        SaveTemplateBUTTON.setToolTipText("");
        SaveTemplateBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveTemplateBUTTONActionPerformed(evt);
            }
        });
 
        LoadTemplateBUTTON.setText("Load Template");
        LoadTemplateBUTTON.setToolTipText("");
        LoadTemplateBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	LoadTemplateBUTTONActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyField3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyField4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyField5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyField6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LoadTemplateBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(SaveTemplateBUTTON)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyField4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyField6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveTemplateBUTTON)
                    .addComponent(LoadTemplateBUTTON))
                .addContainerGap())
        );
 
        pack();
    }
 
	private void copyField1ActionPerformed(java.awt.event.ActionEvent evt) {
		//Create clipboard object and paste the value of the TextField
		ToClipboard toclipboard = new ToClipboard();
		toclipboard.copyfrom(TextField1.getText());
	}
	 
	private void copyField2ActionPerformed(java.awt.event.ActionEvent evt) {
		//Create clipboard object and paste the value of the TextField
		ToClipboard toclipboard = new ToClipboard();
		toclipboard.copyfrom(TextField2.getText());
	}
	 
	private void copyField3ActionPerformed(java.awt.event.ActionEvent evt) {
		//Create clipboard object and paste the value of the TextField
		ToClipboard toclipboard = new ToClipboard();
		toclipboard.copyfrom(TextField3.getText());
	}
	 
	private void copyField4ActionPerformed(java.awt.event.ActionEvent evt) {
		//Create clipboard object and paste the value of the TextField
		ToClipboard toclipboard = new ToClipboard();
		toclipboard.copyfrom(TextField4.getText());
	}
	 
	private void copyField5ActionPerformed(java.awt.event.ActionEvent evt) {
		//Create clipboard object and paste the value of the TextField
		ToClipboard toclipboard = new ToClipboard();
		toclipboard.copyfrom(TextField5.getText());
	}
	 
	private void copyField6ActionPerformed(java.awt.event.ActionEvent evt) {
		//Create clipboard object and paste the value of the TextField
		ToClipboard toclipboard = new ToClipboard();
		toclipboard.copyfrom(TextField6.getText());
	}
	 
	private void SaveTemplateBUTTONActionPerformed(java.awt.event.ActionEvent evt) {
		//Save the current values of all text fields to a file.
	    Save save = new Save(filename);
	    save.setField(TextField1.getText(), 1);
	    save.setField(TextField2.getText(), 2);
	    save.setField(TextField3.getText(), 3);
	    save.setField(TextField4.getText(), 4);
	    save.setField(TextField5.getText(), 5);
	    save.setField(TextField6.getText(), 6);
	    save.SaveMethod();
	}
 
	private static void LoadTemplateBUTTONActionPerformed(java.awt.event.ActionEvent evt) {
    	//Load previous template values from file.
    	//If no file exists give error that one must first be saved.
        Load load = new Load(filename);
        load.LoadMethod();
        TextField1.setText(load.getField(1));
        TextField2.setText(load.getField(2));
        TextField3.setText(load.getField(3));
        TextField4.setText(load.getField(4));
        TextField5.setText(load.getField(5));
        TextField6.setText(load.getField(6));
    }
 
    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuickCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuickCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuickCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuickCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
 
            public void run() {
                new QuickCopy().setVisible(true);
            }
        });
    }
}