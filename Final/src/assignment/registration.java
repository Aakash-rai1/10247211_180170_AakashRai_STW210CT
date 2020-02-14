/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author aakas
 */
public class registration extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Signup Form");
   Container con = frame.getContentPane();
   JLabel lname ,lemail,lpassword,lsform;
   JTextField tname,temail;
   JPasswordField tpassword;
   JButton signup,back;
   
   
   public registration(){
    frame.setSize(800, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    con.setLayout(null);
    con.setLayout(null);
    
//    For label
    lname = new JLabel("Name");
    lname.setBounds(200,60,100,50);
    con.add(lname);
        
    lemail = new JLabel("Email");
    lemail.setBounds(200,100,100,50);
    con.add(lemail);
    
    lpassword = new JLabel("Password");
    lpassword.setBounds(200,140,100,50);
    con.add(lpassword);
    
    
    
//    For textfield
    lsform = new JLabel("Signup Form");
    lsform.setBounds(360,10,300,50);
    con.add(lsform);
    
    
    tname= new JTextField("");
    tname.setBounds(300,75,200,25);
    con.add(tname);
    
    
    temail= new JTextField("");
    temail.setBounds(300,115,200,25);
    con.add(temail);
    
    
    tpassword= new JPasswordField("");
    tpassword.setBounds(300,155,200,25);
    con.add(tpassword);
    
    signup = new JButton("Submit");
    signup.setBounds(350, 200,80,25);
    con.add(signup);
    signup.addActionListener(this);
    
    back =new JButton("Back");
    back.setBounds(30,10,80,25);
    con.add(back);
    back.addActionListener(this);
    
}
   public static void main (String[] args){
       
       registration R = new registration();
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signup)
        {
            System.out.println("BUTTON CLICKED");
            try {
                database db=new database();
                int result=db.save(tname.getText(),temail.getText(),tpassword.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Saved Successfully.");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to save the data.");
                }
            } catch (Exception ae) {
            }
    }
        if(e.getSource()==back){
            new userlogin();
         frame.dispose();
        }
    
}
}
