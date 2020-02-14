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
public class week5_1 {
    Node N; 
	   
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
  
    void Remove() 
    { 
        
        Node A = N; 
        while (A != null) { 
             Node temp = A; 
            while(temp!=null && temp.data==A.data) { 
                temp = temp.next; 
            } 
            A.next = temp; 
            A = A.next; 
        } 
    } 
                      
   
    public void num(int new_data) 
    { 
        
        Node Newnode = new Node(new_data); 
        Newnode.next = N; 
        N = Newnode; 
    } 
  
   
     void printList() 
     { 
         Node temp = N; 
         while (temp != null) 
         { 
            System.out.print(temp.data+" "); 
            temp = temp.next; 
         }   
         System.out.println(); 
     } 
  
    
    public static void main(String args[]) 
    { 
    	week5_1 a = new week5_1(); 
        a.num(100); 
        a.num(100); 
        a.num(100); 
        a.num(100); 
        a.num(100); 
        a.num(100);
          
        a.Remove(); 
        System.out.println("the list after removing dublicate is:"); 
        a.printList(); 
    } 
}
