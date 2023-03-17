package Exercícios;

import java.util.Scanner;

public class SubArrayNegativo {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		int tamVet = entrada.nextInt();
		
		int vetor[] = new int[tamVet];
	 
	
		for(int i=0;i< vetor.length;i++) {
			
		     vetor[i]=entrada.nextInt();
		}
		
		
		
		int count=0;
		
		
		for(int i=0;i<=vetor.length;i++) {
			
		    int soma=0;
			   
			for(int j=i;j<vetor
					
					.length;j++) {
				
			soma+=vetor[j];
			if(soma<0) {
				
				count++;
			}
			
				
		
			
		}
			
			
			
		
		
			
	}
		System.out.println(count);
		

	
	
	}

}
