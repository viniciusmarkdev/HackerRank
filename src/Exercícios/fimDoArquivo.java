package Exercícios;

import java.util.Scanner;

public class fimDoArquivo {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\\s+");
		
		
		
		String entrada;
		
		
		
		int i = 1; 
	
		
		for( ; scanner.hasNext() != false ; i++) {
			
			
			entrada = scanner.next();
			
		
			
			
		
		
			
		   
			
			
			System.out.print(i+" "+entrada);
			
			
			System.out.println(scanner.nextLine());
			
			
		}
	
		
		
		
	 
		
	}
	
 
	}
