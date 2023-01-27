package Exercícios;

import java.util.Scanner;

public class stringEspaco {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);	
		
		System.out.println("Digite a palavra a ser criptografada ");
		String palavra = input.next();		
		String j = " java for ever ";
						
		System.out.println(palavra.replaceAll(" ", ""));		
		System.out.println(j.replaceAll(" ", ""));
		
	}
	
}
