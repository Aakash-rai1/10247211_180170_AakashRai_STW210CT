/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklyassignment;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author aakas
 */
public class week4_2 {
    public static void main(String[] args) {
		int num,numTOChoose,tries=0;
		boolean win =false;
		Random r=new Random();
		numTOChoose=r.nextInt(20000);
		Scanner userinput=new Scanner(System.in);
		
		
		while (win==false) {
			System.out.println("Pick a number between 1 to 20000");
			num=userinput.nextInt();
			tries++;
			if(num>20000 || num<0) {
				System.out.println("Your chance to pick  has been reached its limit.");
			}
			else {
			if(num == numTOChoose) {
				win=true;
			}
			else if(num<numTOChoose) {
				System.out.println("Your number is less than the number you picked.  ");
			}
			else if(num>numTOChoose) {
				System.out.println("Your number is greater than the number you picked");
			}
			}
		}
		
		System.out.println("Congratulations you Win");
		System.out.println("The number is" + numTOChoose );
		System.out.println("It takes "+tries+"tries to win");
        
	}
    
}
