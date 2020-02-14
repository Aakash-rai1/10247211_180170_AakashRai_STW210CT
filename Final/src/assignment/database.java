/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.sql.*;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sun.security.rsa.RSACore;
/**
 *
 * @author aakas
 */
public class database {

    static Iterable<questiongetter> questionData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Connection conn;
    PreparedStatement pstmt;
    public static String token="";
    public static String name="";
    
    public database()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa_assignment","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
  
    
    
    
//    public class token{
//        Random rand=new Random();
//
//int token= rand.nextInt(100000000);
//
//if(tokentxtfield.getText()==token){
//JoptionPane.showMessageDialogue(null,"Token doesnot match");
//  new //token wala page();
//}
//else
//{
//JoptionPane.showMessageDialogue(null,"Token doesnot match");
////}
//    }
    //Questions
    public int saveanswer(int scode,String subject,String question,String answer1,String answer2,String answer3,String answer4,String correct)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into question(subjectcode,subject,question,answer1,answer2,answer3,answer4,correct) values(?,?,?,?,?,?,?,?)");
            
            pstmt.setInt(1,scode);
            pstmt.setString(2,subject);
            pstmt.setString(3,question);
            pstmt.setString(4,answer1);
            pstmt.setString(5,answer2);
            pstmt.setString(6,answer3);
            pstmt.setString(7,answer4);
            pstmt.setString(8,correct);
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
    
    //Update Questions
    
    public int updateanswer(int id,int scode,String subject,String question,String answer1,String answer2,String answer3,String answer4,String correct)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("update question set subjectcode = ?,  subject =?, question = ? , answer1 =? , answer2 =? , answer3 = ? , answer4 = ?, correct = ? where id = ? ");
            
            pstmt.setInt(1,scode);
            pstmt.setString(2,subject);
            pstmt.setString(3,question);
            pstmt.setString(4,answer1);
            pstmt.setString(5,answer2);
            pstmt.setString(6,answer3);
            pstmt.setString(7,answer4);
            pstmt.setString(8,correct);
            pstmt.setInt(9,id);
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
    
    
    
//    public int updateanswer(int scode,String subject,String question,String answer1,String answer2,String answer3,String answer4,String correct,int id)
//    {
//        int result=0;
//        try{
//            pstmt = conn.prepareStatement("update question set subjectcode = ?,  subject =?, question = ? , answer1 =? , answer2 =? , answer3 = ? , answer4 = ?, correct = ? where id = ? ");
//            pstmt.setInt(1,scode);
//            pstmt.setString(2,subject);
//            pstmt.setString(3,question);
//            pstmt.setString(4,answer1);
//            pstmt.setString(5,answer2);
//            pstmt.setString(6,answer3);
//            pstmt.setString(7,answer4);
//            pstmt.setString(8,correct);
//            pstmt.setInt(9,id);
//            
//            result=pstmt.executeUpdate();
//        } catch (Exception e) {
//            System.out.println("Error: "+e);
//        }
//           
//            return result;
//    }
//    
////          delete question
         public int deletequestion(int id) {
        int result = 0;
        try {

            
            pstmt = conn.prepareStatement("delete from question where id = ? ");
           
               pstmt.setInt(1, id);
              
           

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
    
    //    login validation
    boolean status = false;

    public boolean login(String name, String password) {

        try {

            pstmt = conn.prepareStatement("select * from signup where name=? and password=?");
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                token=rs.getString("token");
                

                return status = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return status;
        
        
        

        
        
        
        

    }
    
    //        for admin login button
        boolean admin= false;

    public boolean admin(String username, String password) {

        try {

            pstmt = conn.prepareStatement("select * from loginadmin where username=? and password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                
                

                return admin = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return admin;
    }
    
//    save user
    public int save(String name,String email,String password)
    {
    
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into signup values(null,?,?,?,?)");
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,password);
            pstmt.setString(4,getAlphaNumericString(5));
            
             
            
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
    
    
    
//         delete user
           public int deleteuser(int id) {
        int result = 0;
        try {

            
            pstmt = conn.prepareStatement("delete from signup where id = ? ");
           
               pstmt.setInt(1, id);
              
           

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
    
    
//    for token
      public String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    }
      
      
      
//      for showing questions
      public List<modules> modulequestion(String modelname){
          List<modules> moduleq= new ArrayList<modules>();
          try{
          pstmt = conn.prepareStatement("select * from question where subject =?");    
          pstmt.setString(1, modelname);
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              
               moduleq.add(new modules(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9)));
          }
          }
          catch(Exception e){
              System.out.println("Error: " + e);
              
          }
          
          return moduleq;
          
      }
      
      
      
//      show users 
    public List<users> getUserDetail() {
         List<users> userListTemp= new ArrayList<users>();
          try{
          pstmt = conn.prepareStatement("select * from signup");
          
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              userListTemp.add(new users(rs.getInt("id"), rs.getString("name"), 
                      rs.getString("email"), rs.getString("password"), rs.getString("token")));
           }
          }
          catch(Exception e){
              System.out.println("Error: " + e);
              
          }
          
          return userListTemp;
    }
      
      
//      question
      public List<questiongetter> questiondata() {
         List<questiongetter> questionListTemp= new ArrayList<questiongetter>();
          try{
          pstmt = conn.prepareStatement("select * from question");
          
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              questionListTemp.add(new questiongetter(rs.getInt("id"), rs.getString("subjectcode"), rs.getString("subject"),rs.getString("question"), rs.getString("answer1"), rs.getString("answer2"), rs.getString("answer3"),rs.getString("answer4"),rs.getString("correct")));
           }
          }
          catch(Exception e){
              System.out.println("Error: " + e);
              
          }
          
          return questionListTemp;
    }
}


    

