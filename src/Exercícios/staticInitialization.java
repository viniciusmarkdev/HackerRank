package Exercícios;

import java.util.Scanner;

public class staticInitialization {
	
	public static void main(String[] args) {
		
		Estatica teste = new Estatica();
	
	}

}

 class Estatica{
	 
	 static {
		 
		  Scanner entrada1 = new Scanner(System.in);
		  int H = entrada1.nextInt();
		  
		  
		  Scanner entrada2 = new Scanner(System.in);
		  int B = entrada2.nextInt();
		  
		 
			  
			  if(B<=0 || H<=0 ) {
				  
				  System.out.println("java.lang.Exception: Breadth and height must be positive");
				  
			  }
			  else {
				  
				 
				int area = H*B;
				System.out.println(area);
			  }
			  
				  
			  
		  }
		  
		  
		  
	 }
 
 
 

	

