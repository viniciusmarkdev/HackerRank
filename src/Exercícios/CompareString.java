package Exerc�cios;

import java.util.Scanner;

public class CompareString {

	public static String getSmallestAndLargest(String s, int k) {
	
		 String sm = s.substring(0, k);
	     String lg = s.substring(0, k);

		for (int i = 0; i <= s.length()-k; i++) {

			
		    /*Passamos a substring para um v�riavel tempo , a cada 
		     * loop esse var�vel muda*/
			String atual = s.substring(i,i+k);
			
			/*
			 *
			 *
			 *Se atual vir antes que sm for verdadeiro
			 *sm = atual. Caso contr�rio ,sm = sm.
			 *
			 *Exemplo : se passarmos
			 *a String "abcd", dividirmos 
			 *a string de 2 e 2 e  atual for 
			 *
			 *atual = "ab"
			 *
			 *e sm = "ab"
			 *
			 *O valor da compara��o ser� falso
			 *e sm = sm
			 *
			 *No pr�ximo valor de atual que ser�
			 *"cd" 
			 *
			 * e a compara��o ser� 
			 * 
			 * "bc".compareTo("ab");
			 * 
			 * que tamb�m ser� falso  
			 * 
			 * e sm = "ab"
			 * 
			 * No pr�ximo  e ultimo loop
			 * 
			 * o valor de atual ser� cd
			 * 
			 * e a compara��o ser� 
			 * 
			 * "cd".compareTo("ab");
			 * 
			 * O valor ser� falso 
			 * 
			 * sm ainda ser� "ab"
			 * 
			 * logo a menor substring lexograficamente
			 * ser� "ab"
			 * 
			 * 
			 * */
			
			
		       
			
			 sm = atual.compareTo(sm) < 0 ? atual : sm;
			
			
	    
	      /*
	       * 
	       * Aqui � efetuado a mesma l�gica para ver 
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
		   * de looping corretos para n�o ultrapassar
		   * o tamanho do array.
		   * 
		   * Por exemplo se queremos pegar as
		   * substring de 0 at� o index 2
		   * 
		   * Teriamos que fazer dois looping
		   * 
		   * incrementando  0+1= 1
		   * no primeiro looping e 1+1 = 2
		   * no segundo looping.
		   * 
		   * Se a string for de tamanho 4
		   * ela ter� indices do 0 ao 3 .
		   * Para pegar todas as substring de
		   * tamanho 2 teremos que iterar  
		   * 3 vezes. Subtraindo 4-2 e colocando
		   *  o operador l�gico <= passaremos
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
