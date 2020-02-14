/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklyassignment;

import java.util.LinkedList;
/**
 *
 * @author aakas
 */
public class week8_1 {
    int VertexOfGraph; 
	        LinkedList<Integer> adjacencyListArray[]; 
	        
	          
	        
	        week8_1(int VertexOfGraph) 
	        { 
	            this.VertexOfGraph = VertexOfGraph; 
	            adjacencyListArray = new LinkedList[VertexOfGraph];
	            for(int i = 0; i < VertexOfGraph ; i++){ 
	                adjacencyListArray[i] = new LinkedList<>(); 
	            } 
	        } 
	
	        public static void main(String args[]) 
		    { 
		        int VertexOfGraph = 5; 
		        week8_1 DirGraph = new week8_1(VertexOfGraph); 
		        addEdge(DirGraph, 0, 1); 
		        addEdge(DirGraph, 0, 2);
		        addEdge(DirGraph, 0, 3);
		        addEdge(DirGraph, 0, 4);
		        addEdge(DirGraph, 1, 2); 
		        addEdge(DirGraph, 1, 3); 
		        addEdge(DirGraph, 1, 4); 
		        addEdge(DirGraph, 2, 3); 
		        addEdge(DirGraph, 3, 4); 
		        printDirectedGraph(DirGraph); 
		    } 

	    static void addEdge(week8_1 DirectedGraph, int src, int dest) 
	    { 
	      
	        DirectedGraph.adjacencyListArray[src].add(dest); 
	     
	    } 
	       
	    
	    static void printDirectedGraph(week8_1 DirectedGraph) 
	    {        
	        for(int VertexOfGraph = 0; VertexOfGraph < DirectedGraph.VertexOfGraph; VertexOfGraph++) 
	        { 
	            System.out.println("Vertex Number"+ VertexOfGraph); 
	            System.out.print("value"); 
	            for(Integer Values: DirectedGraph.adjacencyListArray[VertexOfGraph]){ 
	                System.out.print(" -> "+Values); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 
}
