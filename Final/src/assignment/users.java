/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author aakas
 */
public class users {
    private int id;
    private String name;
    private String email;
    private String password;
    private String token;

    public users(int id, String name, String email,  String password, String token) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.token = token;
        
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String gettoken() {
        return token;
    }

    public void settoken(String token) {
        this.token = token;
    }

    
}
