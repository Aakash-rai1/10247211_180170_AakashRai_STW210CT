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
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author aakas
 */
public class updatequestion extends JFrame implements ActionListener{
  JFrame frame = new JFrame("Update Question");
   Container con = frame.getContentPane();
   JLabel title,question,a1,a2,a3,a4,correct,sub,scode,id;
   JTextField tquestion,t1,t2,t3,t4,tcorrect,tsub,tcode,tid;
   JButton update,back;
   
   public updatequestion(){
    frame.setSize(800, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    con.setLayout(null);
    
    title = new JLabel("Update Question");
    title.setBounds(370,10,300,50);
    con.add(title);
     
    
//    text
    id = new JLabel("ID");
    id.setBounds(100,60,100,50);
    con.add(id);
    
    tid= new JTextField("");
    tid.setBounds(165,75,50,25);
    con.add(tid);
    
    
    
    
    scode = new JLabel("Subject Code");
    scode.setBounds(300,60,100,50);
    con.add(scode);
    
    sub = new JLabel("Subject");
    sub.setBounds(300,100,100,50);
    con.add(sub);
    
    question = new JLabel("Question");
    question.setBounds(300,140,100,50);
    con.add(question);
    
    a1 = new JLabel("Answer first");
    a1.setBounds(300,180,100,50);
    con.add(a1);
    
    a2 = new JLabel("Answer second");
    a2.setBounds(300,220,100,50);
    con.add(a2);
    
    a3 = new JLabel("Answer third");
    a3.setBounds(300,260,100,50);
    con.add(a3);
    
    a4 = new JLabel("Answer fourth");
    a4.setBounds(300,300,100,50);
    con.add(a4);
    
    correct = new JLabel("Correct Answer");
    correct.setBounds(300,340,100,50);
    con.add(correct);
    
    
    
    
    
    
//    boxes
    tcode= new JTextField("");
    tcode.setBounds(400,75,150,25);
    con.add(tcode);
    
    tsub= new JTextField("");
    tsub.setBounds(400,115,150,25);
    con.add(tsub);
    
    tquestion= new JTextField("");
    tquestion.setBounds(400,155,150,25);
    con.add(tquestion);
    
    t1= new JTextField("");
    t1.setBounds(400,205,150,25);
    con.add(t1);
    
    t2= new JTextField("");
    t2.setBounds(400,245,150,25);
    con.add(t2);
    
    t3= new JTextField("");
    t3.setBounds(400,285,150,25);
    con.add(t3);
    
    t4= new JTextField("");
    t4.setBounds(400,325,150,25);
    con.add(t4);
    
    tcorrect= new JTextField("");
    tcorrect.setBounds(400,365,150,25);
    con.add(tcorrect);
    
//    Button
    update = new JButton("Update");
    update.setBounds(400, 400,80,25);
    con.add(update);
    update.addActionListener(this);
    
    back =new JButton("Back");
    back.setBounds(30,10,80,25);
    con.add(back);
    back.addActionListener(this);
    
        
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==update)
        {
            System.out.println("BUTTON CLIdaCKED");
            try {
                System.out.println("hello");
                database db=new database();
                int result=db.updateanswer(Integer.parseInt(tid.getText()), Integer.parseInt(tcode.getText()),tsub.getText(),tquestion.getText(),t1.getText(), t2.getText(), t3.getText(),t4.getText(),tcorrect.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Updated Successfully.");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to Update the question.");
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

