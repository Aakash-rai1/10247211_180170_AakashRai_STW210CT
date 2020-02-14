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
public class week3_recursive {
    public static void main (String[] args) {
	Scanner userinput = new Scanner(System.in);
	System.out.println("Enter a word:  ");
	String Str = userinput.nextLine();
	
	String rvrs = reverse_string(Str);
	System.out.println("Reverse form: " + rvrs);
	
}
public static String reverse_string(String str)
{
    if (str.isEmpty())
        return str;
    return reverse_string(str.substring(1)) + str.charAt(0);
}
}
