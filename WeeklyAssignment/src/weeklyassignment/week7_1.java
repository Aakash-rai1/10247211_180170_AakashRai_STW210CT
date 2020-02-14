/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklyassignment;


import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author aakas
 */
public class week7_1 {
    int Vertex; 
     LinkedList<Integer> adjancyList[];
     void addEdge(int noOfver,int widthOfUndirectedGraph) 
	    { 
	        adjancyList[noOfver].add(widthOfUndirectedGraph); 
	    } 
     public static void main(String args[])
     {
         week7_1 Graph = new week7_1(7);
  
         Graph.addEdge(0, 1);
         Graph.addEdge(0, 2);
         Graph.addEdge(1, 2);
         Graph.addEdge(2, 0);
         Graph.addEdge(2, 3);
         Graph.addEdge(3, 3);
         Graph.addEdge(3, 4);
         Graph.addEdge(3, 5);
         Graph.addEdge(3, 6);
  
         System.out.println("Following is Breadth First Traversal "+
                            "(starting from vertex 2)");
  
         Graph.BFS(3);
     }
    
    
  
    
    void BFS(int s) 
    { 
        boolean visited[] = new boolean[Vertex]; 
  
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
     
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            
            s = queue.poll(); 
            System.out.print(s+" "); 
  
          
            Iterator<Integer> i = adjancyList[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
 
    public week7_1(int ver) 
    { 
        Vertex = ver; 
        adjancyList = new LinkedList[ver]; 
        for (int i=0; i<ver; ++i) {
            adjancyList[i] = new LinkedList(); 
        }
    } 
}
