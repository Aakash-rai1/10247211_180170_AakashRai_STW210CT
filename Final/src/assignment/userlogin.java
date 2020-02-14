/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aakas
 */
public class userlogin extends JFrame implements ActionListener{
    
    JLabel llogin,username,password;
    JTextField tusername;
   JPasswordField tpassword;
   JButton login,signup,admin;
   
    
   userlogin(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Form");
	setSize(800, 500);
	Container Content= getContentPane();
	Content.setLayout(null);
        setVisible(true);
	username = new JLabel("Username");
	password = new JLabel("Password");
        llogin= new JLabel("Login Form");
	
	tusername = new JTextField();
	tpassword = new JPasswordField();
	login = new JButton("Login");
        signup = new JButton("signup");
        admin = new JButton("Admin");
        
        llogin.setBounds(360,10,100,50);
        username.setBounds(200,60,100,50);
        password.setBounds(200,100,100,50);
        tusername.setBounds(300,70,180,25);
        tpassword.setBounds(300,120,180,25);
        login.setBounds(300, 170,80,25);
        signup.setBounds(400, 170,80,25);
        admin.setBounds(350, 220,80,25);
      
        
        
        Content.add(username);Content.add(tusername);Content.add(login);Content.add(signup);
	Content.add(password);Content.add(tpassword);Content.add(llogin);Content.add(admin);
	login.addActionListener(this);
        signup.addActionListener(this);
        admin.addActionListener(this);
   }
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
       //To change body of generated methods, choose Tools | Templates.
      if(e.getSource()==login)
        {
    	 System.out.println(tusername.getText().toString()+ tpassword.getText().toString());
         try{
             database db=new database();
             if(db.login(tusername.getText().toString(),tpassword.getText().toString())){
                 JOptionPane.showMessageDialog(null, "Login successful");
                 
                 token t=new token();
                 dispose();
                
                      
             }
             
             else{
                 JOptionPane.showMessageDialog(null, "not successful");
             }
         }catch(Exception ae){
         }
    	}
      
      if(e.getSource().equals(signup))
        {
    	 new registration();
         dispose();
	}
      if(e.getSource().equals(admin))
        {
    	 new adminlogin();
         dispose();
	}
    }
    
		
	
	

public static void main(String[] args)
{
  new userlogin();
}
}