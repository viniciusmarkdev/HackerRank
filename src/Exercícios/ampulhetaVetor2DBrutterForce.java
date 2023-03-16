package Exercícios;

import java.util.Scanner;

public class ampulhetaVetor2DBrutterForce {

  public static void main(String[] args) {
	
	//Classe Wrapper de tipos inteiros
	//Podem ser tratados como objetos
   //O Integer.MIN_VALUE define o minimo valor 
   //constante que um int pode ter, que é -2^31
	  
	
			
			int maxSum= Integer.MIN_VALUE;
			
			System.out.println(maxSum);
			
			/*O i representa cada linha da 
			 *da nossa Matriz.Nossa em uma
			 *matriz 6X6 teremos 16 ampulhetas.
			 * Para contalas é preciso ir até
			 * a linha quatro, pois depois 
			 * dessa linha não há mais ampulhetas
			 */
			
			//Entrada de dados do teclado
			  Scanner scanner = new Scanner(System.in);
			  
			  /*
			   * 
			   * 
			   * */
			  //Criação do array 2D
			  int[][] arr = new int[6][6];
			  
			  //Popular a matriz 2D 6X6
			  for (int i = 0; i < 6; i++) { 
				  for  (int j = 0; j < 6; j++)  { 
					  
					  arr[i][j] = scanner.nextInt(); 
					  
				  }
				  
			  }
			
			
		    for (int i = 0; i < 4; i++) {
		    	
		      	/*
		    	 * O segundo for representa nossa coluna
		    	 * que também vai até a quarta coluna re-
		    	 * presentada por j.A contagem das ampu-
		    	 * lhetas seguem a mesma lógica que a 
		    	 * contagem por linhas.
		    	 * 
		    	 * */
		    	System.out.println();
		    	
		    	//Conto todas as ampulhetas
		    	 for (int j = 0; j < 4; j++) {
				    	
		   int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2] 
	             + arr[i+1][j+1] + arr[i+2][j] 
	             + arr[i+2][j+1] + arr[i+2][j+2];
	            maxSum = Math.max(maxSum, sum);
				    	
				    }

		    	
		    }


		    System.out.println(maxSum);
		    scanner.close();

		    
		 
		
	
}
			
		

}
