package Exercícios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class StackSolutionArray1Dgame {
	
    
	
public static boolean canWin(int leap , int[] game) {
		
		Stack<Integer> stack = new Stack<>();
		Set<Integer> visited = new HashSet<>();
		
		stack.add(0);
		
		visited.add(0);
	
	
	  
		
	   while(stack.size()!=0) {
		   
		   
			
			int curr = stack.pop();
			   
		
		   if(curr+1>=game.length || curr+leap >= game.length) {
			   
			   return true;
			   
			   
		   }
		    
		   
		   if (curr > 0 && game[curr - 1] == 0 && !visited.contains(curr - 1)) {
			   
			   
			   stack.push(curr - 1);
               visited.add(curr - 1);
			   
			   
		   }	
		   
		   	
		   if (game[curr + 1] == 0 && !visited.contains(curr + 1)){
            
			   stack.push(curr + 1);
               visited.add(curr + 1);
               
               
               
          
            if (game[curr + leap] == 0 && !visited.contains(curr + leap)) {
                  
            	   stack.push(curr + leap);
                   visited.add(curr + leap);
               }
           
           }
		   
		   
		   
		
	}
		
		
		   
	   
		
		return false;
		
		
	}
	
	
	   public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }
	}
	
	  
	  
	  
	  
	 


