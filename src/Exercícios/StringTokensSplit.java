package Exercícios;

import java.util.Scanner;

public class StringTokensSplit {
	
	 public static void main(String[] args) {
	       
		    Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	      
	        scan.close();
	        
	        
	     
	        s = s.trim();
	        
	        
	        
	        if(s.length() == 0) {
	             System.out.println("0");
	        }
	        
	        else {
	        
	        String [] letras  = s.split("[ !,?._'@]+");
	        
	        
	      int k =0;
             for(String letra:letras) {
	        	
	        	
	    	      
	        	
	            
	        	k++;
	        	
	        	
	        }
	        
	        
	        
         
	        System.out.println(k);
	        
	       
	        for(String letra:letras) {
	        	
	        	
	    	      
	        	
	            
	        	System.out.println(letra);
	        	
	        	
	        }
	       
	 }
	   
	 }

}