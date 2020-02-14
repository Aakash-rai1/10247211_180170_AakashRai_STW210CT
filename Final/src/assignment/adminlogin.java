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
public class adminlogin extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Admin Login");
   Container con = frame.getContentPane();
   JLabel lusername ,lpassword,alogin;
   JTextField tuname;
   JPasswordField tapassword;
   JButton login, back;
   
   public adminlogin(){
    frame.setSize(800, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    con.setLayout(null);
    
    
    alogin = new JLabel("Admin Login Form");
    alogin.setBounds(370,10,300,50);
    con.add(alogin);
    
    
    
    lusername = new JLabel("Admin name");
    lusername.setBounds(300,60,100,50);
    con.add(lusername);
        
    lpassword = new JLabel("Password");
    lpassword.setBounds(300,100,100,50);
    con.add(lpassword);
    
    
    tuname= new JTextField("");
    tuname.setBounds(400,75,150,25);
    con.add(tuname);
    
    
    tapassword= new JPasswordField("");
    tapassword.setBounds(400,115,150,25);
    con.add(tapassword);
    
    login = new JButton("Login");
    login.setBounds(400, 200,80,25);
    con.add(login);
    login.addActionListener(this);
    
    back =new JButton("Back");
    back.setBounds(30,10,80,25);
    con.add(back);
    back.addActionListener(this);
    
   }   
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login)
        {
    	 System.out.println(tuname.getText().toString()+ tapassword.getText().toString());
         try{
             database db=new database();
             if(db.admin(tuname.getText().toString(),tapassword.getText().toString())){
                 JOptionPane.showMessageDialog(null, "Login successful");
                 
                 adminwelcome aw=new adminwelcome();
                 frame.dispose();
                
                      
             }
             
             else{
                 JOptionPane.showMessageDialog(null, "not successful");
             }
         }catch(Exception ae){
         }
    	}
        
        if(e.getSource()==back){
            new userlogin();
         frame.dispose();
        }
    }
   
   
   
    
}
