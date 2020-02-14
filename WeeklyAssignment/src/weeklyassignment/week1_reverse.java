/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklyassignment;

import java.util.Scanner;
/**
 *
 * @author aakas
 */
public class week1_reverse {
    public static void main(String[] args) {
	
	
	Scanner userinput = new Scanner(System.in);
	System.out.println("Enter a word: ");
	String sentence= userinput.next();
        
        byte [] str = sentence.getBytes();
        byte [] result =   new byte [str.length];
	   for (int i = 0; i<str.length; i++) 
           result[i] = str[str.length-i-1]; 
 
       System.out.println(new String(result));
	
}
    
}
