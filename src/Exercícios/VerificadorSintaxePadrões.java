package Exerc�cios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificadorSintaxePadr�es {
	
	
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		Pattern padr�o = Pattern.compile("[a-zA-Z]");
		
		
		while(testCases>0  ){
			
			testCases--;
			String pattern = in.nextLine();
          	//Write your code
			Matcher matcher = padr�o.matcher(pattern);
	       boolean b = matcher.matches();
	       
	        if(b==true) {
	        	
	        	  System.out.println("Valid");
	        }else {
	        	
	        	 System.out.println("Invalid");
	        }
	      
			
		}
	}
	

}
