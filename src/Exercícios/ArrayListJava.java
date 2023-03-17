package Exercícios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListJava {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
	    int linhas = entrada.nextInt();
	    
	    List<List<Integer>> arr =   new ArrayList<>();
	    

	    
	    
	    
	    int qvalores=0;
	   
	  
	    for(int i=0 ; i<linhas;i++) {
	        
	        List<Integer> n =new ArrayList<Integer>();
	     
	         qvalores=entrada.nextInt();
	        
	         
	        for(int j=0;j<qvalores;j++) {
	        
	         int valores =entrada.nextInt();
	          n.add(valores);
	        
	        
	        
	    }
	        
	    arr.add(n);
	    
	  
	   
	    }
	   
	        
	        
	        int qtdConsultas=entrada.nextInt();
	        
	        for(int i=0; i<=qtdConsultas;i++) {
	            
	            
	            
	                int l = entrada.nextInt();
	                int c = entrada.nextInt();
	                
	         try {
	            
	             System.out.println(arr.get(l-1).get(c-1));
	        
	        
	        
	        }catch(IndexOutOfBoundsException exception ) {
	        
	         System.out.println("ERROR!");
	        
	        
	    }
	    

	    
	    
	    }
	    
	    }
	}
