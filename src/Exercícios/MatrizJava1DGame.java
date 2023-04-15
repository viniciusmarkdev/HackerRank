package Exercícios;

import java.util.Scanner;

public class MatrizJava1DGame {
	
	public static boolean canWin(int leap, int[] game) {
		
		
		//Solução não passou em todos os testes
		
	  
	    boolean ganhou = false;
			
	    int soma =0;
	    
		for(int i=0 ; i<game.length ; i++) {
			
			
			
			if(game[i]==1) {
				
			    
				 soma = leap+1;
				 
				 

				 if(soma>= game.length ) {
						
					 ganhou = true;
					
						
					}else {
						
						ganhou=false;
					}
				 break;
				 
				 
					
				

			}
			
		
			
			if(game[i]==0) {
				
				ganhou=true;	
				
			}
			
		 
			
			
		}
		
		
	
		
		return ganhou;
			
			
		}
	
		


	
	public static void main(String[] args) {
		
		int game[]= {0,1,0,1,0,1};


	
		System.out.println(canWin(2,game));	
	}
	
}
