package Exercícios;

import java.util.Scanner;
import java.util.regex.Pattern;

public class teste {

	public static void main(String[] args) {

		
		
	int [][] b = {{3,3,3,4,5,6},
			      {3,3,3,4,5,6},
			      {3,3,3,4,5,6},
			      {1,2,3,4,5,6},
		          {1,2,3,4,5,6},
		          {1,2,3,4,5,6}};
	   
		int total =0 ;
		int meio = 0;
		int linha= 1;
		int coluna =1;
		int somaTotal = 0;
		
		for(int i=0;i<=b.length-3;i++) {
			
			
			
			for(int k =0 ; k<=b.length-4;k++) {
				
				total+=b[i][k];
				meio=b[linha][coluna];
			}
	        
			i=i+1;
            
			
			
			
			somaTotal = total+meio;
			

		
		}
		System.out.println(somaTotal);
		
		
		
		
	}

}
