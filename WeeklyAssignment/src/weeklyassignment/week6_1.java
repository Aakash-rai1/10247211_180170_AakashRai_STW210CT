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
public class week6_1 {
    static class binary {
            int value;
            binary a , c ;
            
            }
    static binary nNode(int datainsert)  
	{  
	    binary b = new binary();    
	    b.value = datainsert;  
	    b.a = null;  
	    b.c = null;  
	    return b;  
	}  
    static binary insert(binary root, int key) {  
	  
	    binary newnode = nNode(key);  
	    binary s = root; 
	    binary j = null;  
	    while (s != null) {  
	        j = s;  
	        if (key < s.value)  
	            s = s.a;  
	        else
	            s = s.c;  
            }
            if (j == null)  
	        j = newnode; 
            else if (key < j.value)  
	        j.a = newnode;
            else
	        j.c = newnode; 
            return j;  
        }
    static void order(binary root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	        order(root.a);  
	        System.out.print( root.value +" ");  
	        order(root.c);  
	    }  
	}  
public static void main(String[] args){
    binary root = null;  
    root = insert(root, 50);  
    insert(root, 10);  
    insert(root, 20);  
    insert(root, 36);  
    insert(root, 56);  
    insert(root, 33);  
    insert(root, 34);  
    order(root);  
}
}
