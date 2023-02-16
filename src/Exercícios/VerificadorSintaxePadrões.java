package Exercícios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class VerificadorSintaxePadrões {
	
	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
           //Execute o bloco
			try{
                String pattern = in.nextLine();
                Pattern.compile(pattern);
             
                System.out.println("Valid");
              //Caso seja lançada uma execeção despare uma mensagem na tela
                
            }catch(PatternSyntaxException e){
             
            	System.out.println("Invalid");
            	//Se tudo der cero decremente  a váriavel testCases
            }finally{
                testCases--;
            }           
		}
        in.close();
	}
	      
	

}
