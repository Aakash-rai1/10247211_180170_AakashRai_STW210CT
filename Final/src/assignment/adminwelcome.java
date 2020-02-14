/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author aakas
 */
public class adminwelcome extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Admin Panel");
    Container con = frame.getContentPane();
   JLabel question,user,aw;
   JButton addq,updateq,deleteq,viewu,deleteu, back;
   
   
   adminwelcome(){
       frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        con.setLayout(null);
        
        
        aw = new JLabel("What would you like to do?");
        aw.setBounds(400,10,300,50);
        con.add(aw);
        
        question = new JLabel("Question");
        question.setBounds(200,60,100,50);
        con.add(question);
        
        user = new JLabel("User");
        user.setBounds(200,200,100,50);
        con.add(user);
    
        
        
        
        //question
        updateq =new JButton("Update");
        updateq.setBounds(300,70,80,25);
        con.add(updateq);
        updateq.addActionListener(this);
        
        deleteq =new JButton("Delete");
        deleteq.setBounds(460,70,80,25);
        con.add(deleteq);
        deleteq.addActionListener(this);
        
        addq =new JButton("Add");
        addq.setBounds(540,70,80,25);
        con.add(addq);
        addq.addActionListener(this);
        
        
        //user
        viewu =new JButton("View");
        viewu.setBounds(300,210,80,25);
        con.add(viewu);
        viewu.addActionListener(this);
        
        
        
        deleteu =new JButton("Delete");
        deleteu.setBounds(460,210,80,25);
        con.add(deleteu);
        deleteu.addActionListener(this);
        
        back =new JButton("Back");
        back.setBounds(30,10,80,25);
        con.add(back);
        back.addActionListener(this);
    
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            new adminlogin();
         frame.dispose();
        }
        
        if(e.getSource()==addq){
            new question();
         frame.dispose();
        }
        
        if(e.getSource()==updateq){
            new updatequestion();
         frame.dispose();
        }
        
        if(e.getSource()==deleteq){
            new deletequestion();
         frame.dispose();
        }
        
        if(e.getSource()==deleteu){
            new deleteuser();
         frame.dispose();
        }
        
        if(e.getSource()==viewu){
            new viewuser();
         frame.dispose();
        }
        
       
        
    }
    
}
