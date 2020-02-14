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
public class week3_2 {
    static int linearSearch(int ar[], int index, int length, int number) 
     { 
          if (length < index) 
             return -1; 
          if (ar[index] == number) 
             return index; 
          if (ar[length] == number) 
             return length; 
          return linearSearch(ar, index+1, length-1, number); 
     } 
       
   
     public static void main(String[] args)  
     { 
    	 int ar[] = {12,24,5,62,1,5,9};
    	 int number,length;
    	 Scanner a=new Scanner(System.in);
    	 System.out.println("What are you searching for?");
    	
         number=a.nextInt();
         a.close();
         length=ar.length-1;
          
        int index = linearSearch(ar, 0, length, number); 
        if (index != -1) 
           System.out.println(number + " exists in" +index); 
        else
            System.out.println(number + " is non-existent"); 
        } 
    
}
