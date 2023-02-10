package Exercícios;

import java.util.Scanner;

public class CompareString {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = " ";

		for (int i = 0; i <= s.length()-k; i++) {

			
		    /*Passamos a substring para um váriavel tempo , a cada 
		     * loop esse varível muda*/
			String temp = s.substring(i,i+k);
			
			/*
			 *Se a váriavel temp vir depois lexograficamnete que 
			 *smallest a várivel temp é a menor.O compareTo
			 *retorna um número inteiro maior que zero  se isso for 
			 *verdadeiro.
			 *
			 * */
			
			
			
			smallest = temp.compareTo(smallest) < 0 ? temp:smallest;
	       
	    
	      /*
	       * 
	       *  Se a váriavel temp vir antes  lexograficamnete que 
			 *smallest a várivel temp é a maior.O compareTo
			 *retorna um número inteiro menor que zero  se isso for 
			 *verdadeiro.
	       * 
	       * 
	       * */
	     
			largest = temp.compareTo(largest) > 0 ? temp:largest;
	      
	      
	       
				
			}
			
		
		
		  /*
		   * 
		   * 
		   * O erro foi resolvido definindo a quantidade
		   * de looping corretos para não ultrapassar
		   * o tamanho do array.
		   * 
		   * Por exemplo se queremos pegar as
		   * substring de 0 até o index 2
		   * 
		   * Teriamos que fazer dois looping
		   * 
		   * incrementando  0+1= 1
		   * no primeiro looping e 1+1 = 2
		   * no segundo looping.
		   * 
		   * Se a string for de tamanho 4
		   * ela terá indices do 0 ao 3 .
		   * Para pegar todas as substring de
		   * tamanho 2 teremos que iterar  
		   * 3 vezes. Subtraindo 4-2 e colocando
		   *  o operador lógico <= passaremos
		   * por 0+1 = 1 1+1 = 2 2+1= 3.
		   * 
		   * 
		   * 
		   * for (int i = 0; i <=s.length(); i++) {

			
			
			
			System.out.println(s.substring(i,k++));
				}
		   * 
		   * 
		   * 
		   * */
          
					
				
				
			
		
		

		

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
		
		
	}
}
