package Exercícios;

import java.util.Scanner;

public class MatrizJava1DGame {
	
	public static boolean canWin(int leap, int[] game) {
		
		
	  
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