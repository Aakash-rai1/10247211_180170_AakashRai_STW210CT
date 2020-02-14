/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklyassignment;

/**
 *
 * @author aakas
 */
public class week4_1 {
    int binary(int arr[], int index, int size, int num) 
    { 
        if (size >= index) { 
            int mid = index + (size - index) / 2; 
  
            if (arr[mid] == num) 
                return mid; 
  
       
            if (arr[mid] > num) 
                return binary(arr, index, mid - 1, num); 
  
          
            return binary(arr, mid + 1, size, num); 
        } 
  
    
        return -1; 
    } 
  
   
    public static void main(String args[]) 
    { 
    	int num,size;
        week4_1 a = new week4_1(); 
        int arr[] = { 0, 10,20,30,40,50,60,70,80,90}; 
       size = arr.length; 
        num = 100; 
        int result = a.binary(arr, 0, size - 1, num); 
        if (result == -1) 
            System.out.println("Number is not present in the array"); 
        else
            System.out.println("Number was found at index " + result); 
    } 
}
