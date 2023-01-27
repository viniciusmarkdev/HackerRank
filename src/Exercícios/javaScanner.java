package Exercícios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class javaScanner {
	
 
    
    
    public static void main(String[] args) throws FileNotFoundException {
    	
 /*
  * A Scannerdivide sua entrada em tokens usando um padrão delimitador, que por padrão corresponde a espaços em branco. Os tokens resultantes podem então ser convertidos em valores de diferentes tipos usando os vários métodos next .
  * Por exemplo, este código permite que um usuário leia um número de System.in : 
  *
  *java.util.Scanner[delimiters=\p{javaWhitespace}+]
  *[position=0][match valid=false][need input=false]
  *[source closed=false][skipped=false]
  *[group separator=\x{2e}]
  *[decimal separator=\x{2c}][positive prefix=]
  *[negative prefix=\Q-\E][positive suffix=][negative suffix=]
  *[NaN string=\QNaN\E][infinity string=\Q?\E]
  *
  *
  */





         Scanner sc = new Scanner(System.in);
    	 System.out.println(sc);
    	
/*Como outro exemplo, este código permite que
 * longtipos sejam atribuídos a partir de entradas em 
 * um arquivo myNumbers:
 * 
 * 
 */
    	 
    	   Scanner sb = new Scanner(System.in); 
    	      while (sc.hasNextLong()) { 
    	          long aLong = sc.nextLong(); 
    	      }
    	 
    	 System.out.println(sb);
		
	
     
    /*
     * scanner também pode usar delimitadores diferentes dos espaços em branco.
     * Este exemplo lê vários itens de uma string:4
     */
    
    
    String input = "1 peixe 2 peixes peixe vermelho peixe azul"; 
    Scanner s = new Scanner(input).useDelimiter("\\s*peixe\\s*");
    System.out.println(s);
    System.out.println(s.nextInt()); 
    System.out.println(s.nextInt()); 
    System.out.println(s.next()); 
    System.out.println(s.next()); 
    s.close();
    
    /*
     * A mesma saída pode ser gerada com este código, que usa uma 
     * expressão regular para analisar todos os quatro tokens de uma só vez:
     */
    
    String entrada = "1 fish 2 fish red fish blue fish";
    Scanner s1 = new Scanner(entrada);
    s1.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
    MatchResult result = s1.match();
    for (int i=1; i<=result.groupCount(); i++)
        System.out.println(result.group(i));
    s1.close(); 
    
    
    /*
     * Teste
     * 
     */
    
    
    Scanner scanner =  new  Scanner( "55 13 + 13,0 = 26,0 77" );  
    //Imprime String  
    System.out.println( "String: "  + scanner.nextLine());  
    //Altera o delimitador deste scanner  
    System.out.println( "Novo delimitador: "  +scanner.useDelimiter( "=" ));  
    scanner.close();  
   
     /*
      * Null parameter
      */
    
    String a  = null;
    System.out.println(a);
    
}
    
}
