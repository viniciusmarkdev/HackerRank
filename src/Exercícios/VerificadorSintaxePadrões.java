package Exerc�cios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class VerificadorSintaxePadr�es {
	
	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
           //Execute o bloco
			try{
                String pattern = in.nextLine();
                Pattern.compile(pattern);
             
                System.out.println("Valid");
              //Caso seja lan�ada uma exece��o despare uma mensagem na tela
                
            }catch(PatternSyntaxException e){
             
            	System.out.println("Invalid");
            	//Se tudo der cero decremente  a v�riavel testCases
            }finally{
                testCases--;
            }           
		}
        in.close();
	}
	      
	

}
