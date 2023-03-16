package Exercícios;

import java.util.Scanner;

public class AmpulhetePratica {
	
	public static void main(String[] args) {
		
		
		int maxSum = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[][] = new int[6][6];
		
		for(int i=0; i<vetor.length;i++) {
			
			for( int j=0; j<vetor.length;j++) {
				
				vetor[i][j]=entrada.nextInt();
				
			}
			
		}
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				int sum=vetor[i][j]+vetor[i][j+1]+vetor[i][j+2]
					 +vetor[i+1][j+1]+vetor[i+2][j]+vetor[i+2][j+1]
							 +vetor[i+2][j+2];
				
				maxSum=Math.max(maxSum, sum);
						
			}
		}
		
		System.out.println(maxSum);
		entrada.close();
			
			
	}

}
