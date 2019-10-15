/*
        Group members
        =============
        Name                                 Registration Number
        ====                                 ===================
        BAMATA WA BAMATA Maurice             18/420/BSSE-S
        NDAHURA BASARA Moses                 19/231/BIT-S
        ALLY KALIMA                          18/1097/BIT-S
        NANNYUNJA NOELINA                    19/536/BSCS-S
        HUSSAIN AKIL BHARMAL                 18/563/BIT-S
        DANIEL AKEEN ATER                    19/632/BIT-S
        */

package org.iuea.oop.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;

import javafx.scene.text.Font;

public class LoginView  extends JFrame{
   //objects
     JTextField userNameField;
     JPasswordField userPasswordField;
     JLabel labelUserName;
     JLabel labelUserPassword;
     JButton buttonLogin;
     JButton buttonCancel;
    
    public LoginView() {
         new JFrame();
         
        String user_name = "admin";
        String user_password = "secret";
        
        JPanel myPanel = new JPanel(  );
        myPanel.setBackground(Color.GRAY);
        labelUserName = new JLabel("Username: "); //  label name
        labelUserName.setBounds(200, 150, 80, 80);
        
        userNameField = new JTextField( 20 ); // user field
        userNameField.setBounds(295, 178, 200, 25);
        System.out.print(userNameField.getBorder());
           
        labelUserPassword = new JLabel ("Password: "); //  label password
        labelUserPassword.setBounds(200, 200, 80, 80);
   
        userPasswordField = new JPasswordField( 20 ); // password field
        userPasswordField.setBounds(295, 230, 200, 25);
        
        
        buttonLogin = new JButton( " Login ");// login button
        buttonLogin.setBounds(300, 300, 78, 30);
        
        
        // Triggering loginbutton and performing validation
		
		  buttonLogin.addActionListener(new ActionListener(){
		  
		  @Override public void actionPerformed(ActionEvent e) { if
		  (userNameField.getText().equals(user_name) &&
		  userPasswordField.getText().equals(user_password)){
		  JOptionPane.showMessageDialog(LoginView.this,
		  "You have successfully logged in ");
		  
		  MainView welcomePage = new MainView(); 
		  dispose();
		  
		  }
		  
		  else { JOptionPane.showMessageDialog(LoginView.this,
		  " You have entered invalid name or password",null
		  ,JOptionPane.ERROR_MESSAGE);
		  
		  } }
		  
		  });	 
        buttonCancel = new JButton( " Cancel"); // cancel button
        buttonCancel.setBounds(400, 300, 78, 30); 
        
        buttonCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {				
				System.exit(0);					
			}
        	
        });
        setLocation(300, 100);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("LoginView");
        
        // Adding components and panel to JFrame     
        getContentPane().add(labelUserPassword);
        getContentPane().add(labelUserName);
        getContentPane().add(userNameField);
        getContentPane().add(userPasswordField);
        getContentPane().add(buttonLogin);
        getContentPane().add(buttonCancel);
        getContentPane().add(myPanel);
        setVisible(true);
        
    }
}

       
