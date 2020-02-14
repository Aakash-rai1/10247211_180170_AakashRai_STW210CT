/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import assignment.loginwelcome;
import assignment.database;
import assignment.modules;
import assignment.token;
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
public class loginwelcome extends JFrame implements ActionListener{

 
   JFrame frame = new JFrame("MCQ Questions");
   Container con = frame.getContentPane();
   JLabel lwelcome ,lchoose;
   JButton submit,back;
   JComboBox option;
   
    
    loginwelcome()
    {
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        con.setLayout(null);
//        con.setBackground(Color.BLUE);
        





       
       
//       For label
       lwelcome = new JLabel("Welcome to MCQ Questions");
        lwelcome.setBounds(460,10,300,50);
        con.add(lwelcome);
        
        lchoose = new JLabel("Please choose your Module");
        lchoose.setBounds(300,100,300,50);
        con.add(lchoose);
        

       String module[]={"Java","CS","CN","Python"};  
       option =new JComboBox(module);
       option.setBounds(480,115,150,25);
       con.add(option);
       
        
       
       
//       submit button
       submit = new JButton("Submit");
        submit.setBounds(480, 220,80,25);
        con.add(submit);
        submit.addActionListener(this);
        
        back =new JButton("Back");
        back.setBounds(30,10,80,25);
        con.add(back);
        back.addActionListener(this);
        

    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            new token();
         frame.dispose();
        }
        
        if(e.getSource()==submit){
            answerform a;
         frame.dispose();
         
         database db=new database();
         switch(option.getSelectedIndex()){
             case 0:
                 a=new answerform(db.modulequestion("Java"));
                 break;
                 
             case 1:
                 a= new answerform(db.modulequestion("CS"));
                 break;
                 
             case 2:
                 a= new answerform(db.modulequestion("CN"));
                 break;
                 
             case 3:
                 a= new answerform(db.modulequestion("Python"));
                 break;
        }
    }
    } 
    
    
     
}
