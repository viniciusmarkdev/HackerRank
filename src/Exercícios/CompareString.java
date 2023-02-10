package Exercícios;

import java.util.Scanner;

public class CompareString {

	public static String getSmallestAndLargest(String s, int k) {
	
		 String sm = s.substring(0, k);
	     String lg = s.substring(0, k);

		for (int i = 0; i <= s.length()-k; i++) {

			
		    /*Passamos a substring para um váriavel tempo , a cada 
		     * loop esse varível muda*/
			String atual = s.substring(i,i+k);
			
			/*
			 *
			 *
			 *Se atual vir antes que sm for verdadeiro
			 *sm = atual. Caso contrário ,sm = sm.
			 *
			 *Exemplo : se passarmos
			 *a String "abcd", dividirmos 
			 *a string de 2 e 2 e  atual for 
			 *
			 *atual = "ab"
			 *
			 *e sm = "ab"
			 *
			 *O valor da comparação será falso
			 *e sm = sm
			 *
			 *No próximo valor de atual que será
			 *"cd" 
			 *
			 * e a comparação será 
			 * 
			 * "bc".compareTo("ab");
			 * 
			 * que também será falso  
			 * 
			 * e sm = "ab"
			 * 
			 * No próximo  e ultimo loop
			 * 
			 * o valor de atual será cd
			 * 
			 * e a comparação será 
			 * 
			 * "cd".compareTo("ab");
			 * 
			 * O valor será falso 
			 * 
			 * sm ainda será "ab"
			 * 
			 * logo a menor substring lexograficamente
			 * será "ab"
			 * 
			 * 
			 * */
			
			
		       
			
			 sm = atual.compareTo(sm) < 0 ? atual : sm;
			
			
	    
	      /*
	       * 
	       * Aqui é efetuado a mesma lógica para ver 
	       * a maior substring lexicograficamente.
	       *  
	       * 
	       * */
	     
			 lg = atual.compareTo(lg) > 0 ? atual : lg; 
	      
	      
	       
				
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
          
					
			

		return sm + "\n" + lg;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
		
		
	}
}
