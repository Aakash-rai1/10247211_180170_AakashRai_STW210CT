/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aakas
 */
public class deleteuser extends JFrame implements ActionListener{
   JFrame frame = new JFrame("Delete User");
   Container con = frame.getContentPane();
   JLabel title,id;
   JTextField tid;
   JButton delete,back;
   
   public deleteuser(){
    frame.setSize(800, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    con.setLayout(null);
    
    title = new JLabel("Delete User");
    title.setBounds(370,10,300,50);
    con.add(title);
    
//    text
    id = new JLabel("User ID");
    id.setBounds(300,60,100,50);
    con.add(id);
    
    tid= new JTextField("");
    tid.setBounds(350,70,150,25);
    con.add(tid);
    
    delete = new JButton("Delete");
    delete.setBounds(400, 110,80,25);
    con.add(delete);
    delete.addActionListener(this);
    
    back =new JButton("Back");
    back.setBounds(30,10,80,25);
    con.add(back);
    back.addActionListener(this);
    
   }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delete)
        {
            System.out.println("BUTTON CLICKED");
            try {
                database db=new database();
                int result=db.deleteuser(Integer.parseInt(tid.getText()));
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Deleted Successfully.");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to delete the user.");
                }
            } catch (Exception ea) {
            }
    }
        
        if(e.getSource()==back){
            new adminwelcome();
         frame.dispose();
        }
    }
    
}
