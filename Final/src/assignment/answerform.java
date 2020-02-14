/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.sql.*;

/**
 *
 * @author aakas
 */
public class answerform extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Test Running");
    Container con = frame.getContentPane();
    JLabel top,jquestion;
    JButton next, back;
    JRadioButton a1, a2,a3, a4;
    int counter,count = 0;    
    List<modules>question;
   
   answerform(List<modules> questions){
       frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        
        question=questions;
        Collections.shuffle(question);
        
        top = new JLabel("Check the correct answer");
        top.setBounds(400,10,300,50);
        con.add(top);
        
        jquestion = new JLabel();
        jquestion.setBounds(200,100,600,50);
        con.add(jquestion);
        
        
        a1 = new JRadioButton();
        a1.setBounds(250, 150, 800, 30);
        con.add(a1);
        
        a2 = new JRadioButton();
        a2.setBounds(250, 200, 800, 30);
        con.add(a2);
        
        a3 = new JRadioButton();
        a3.setBounds(250, 250, 800, 30);
        con.add(a3);
        
        a4 = new JRadioButton();
        a4.setBounds(250, 300, 800, 30);
        con.add(a4);
        
        
        ButtonGroup group = new ButtonGroup();
        group.add(a1);
        group.add(a2);
        group.add(a3);
        group.add(a4);
        setquestion();
        
        
        
//        button
        next = new JButton("Next");
        next.setBounds(300, 350, 90, 30);
        con.add(next);
        next.addActionListener(this);
        
        
        
        back =new JButton("Back");
        back.setBounds(30,10,80,25);
        con.add(back);
        back.addActionListener(this);
        
        
        
   }
      

    @Override
    public void actionPerformed(ActionEvent e) {
        String UserAnswer;
        if (e.getSource() == next) {
            if (a1.isSelected()) { 
                    
                UserAnswer = question.get(counter).getAnswer1();
                   
                } 
  
                else if (a2.isSelected()) { 
                    UserAnswer = question.get(counter).getAnswer2();
                    
                } 
                else if(a3.isSelected()){ 
  
                    UserAnswer = question.get(counter).getAnswer3();
                } 
                else{
                    UserAnswer = question.get(counter).getAnswer4();
                }
            if(UserAnswer.equals(question.get(counter).getcorrect())){
                count++;
            }
            if(counter+1!= question.size()){
            counter++;
            setquestion();
            }
            else{
                JOptionPane.showMessageDialog(null,"Your score is"+ count+"/"+question.size());
                frame.dispose();
            }
        }
        
        if(e.getSource()==back){
            new userlogin();
         frame.dispose();
        }
       
    }
 public void setquestion(){
        jquestion.setText(question.get(counter).getQuestion());
        a1.setText(question.get(counter).getAnswer1());
        a2.setText(question.get(counter).getAnswer2());
        a3.setText(question.get(counter).getAnswer3());
        a4.setText(question.get(counter).getAnswer4());
    }
    
    
}
