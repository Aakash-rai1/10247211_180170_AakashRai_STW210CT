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
public class token extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Token");
   Container con = frame.getContentPane();
   JLabel wtoken,ltoken ,vtoken, insert;
   JButton btnenter, back;
   
   
    
   token(){
       frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        con.setLayout(null);
        
        wtoken = new JLabel("Get your token here:");
        wtoken.setBounds(460,10,300,50);
        con.add(wtoken);
        
        
        
        
        ltoken = new JLabel("Your Token:");
        ltoken.setBounds(300,60,100,50);
        con.add(ltoken);
       
        vtoken = new JLabel();
        vtoken.setText(database.token);
        vtoken.setBounds(400,70,180,25);
        con.add(vtoken);
        
        vtoken = new JLabel("Enter token now");
        vtoken.setBounds(300,100,100,50);
        con.add(vtoken);
        
//        enter button
       btnenter = new JButton("Enter Now");
        btnenter.setBounds(400, 115,120,25);
        con.add(btnenter);
        btnenter.addActionListener(this);
        
        
        
        
        back =new JButton("Back");
        back.setBounds(30,10,80,25);
        con.add(back);
        back.addActionListener(this);
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnenter)
        {
    	loginwelcome L = new loginwelcome();
        frame.dispose();
       
	}
       
       
       
       if(e.getSource()==back){
            new userlogin();
         frame.dispose();
        }
    }
    

 }
