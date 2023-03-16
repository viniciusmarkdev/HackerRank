package Exercícios;

import java.util.Scanner;
import java.util.regex.Pattern;

public class teste {

	public static void main(String[] args) {

	
    //Tentativa de resolver o array 2D ampulheta 
		
	int [][] b = {{1,1,1,1,1,1},
			      {1,1,1,1,1,1},
			      {1,1,1,1,1,1},
			      {1,1,1,1,1,1},
		          {1,1,1,1,1,1},
		          {1,1,1,1,1,1}};
	   
		int total =0 ;
		int meio = 0;
		int linha=0;
		int coluna=1;
	   int cont =0;
		
		
		int somaTotal = 0;
	
		
	 for(int j=0; j<b.length; j++) {
			
		
		 
		 linha++;
		 cont++;
		
		 
			
		
		   for(int i=j;i<b.length-3+cont-2;i++) {
			
			
			
		
			
			for(int k=0 ; k<b.length-4+cont-2;k++) {
				
				total+=b[i][k];
			
			
				
				
			
				
				
			}
		
	        
			i=i+1;
			
		    
	
           
			
			
			
			
			
		
		}

		
		meio+=b[linha-1][coluna];
		somaTotal = total+meio;
		
	
		
		
		
		}
	 
	 System.out.println(somaTotal);
	}

}

