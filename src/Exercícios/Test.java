package Exercícios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Test {
	
	
	public static void main(String[] args) {

	
		System.out.println(isPalindrome("a"));
		
		int n = 64;
		
		String a = String.valueOf(64);
		
		System.out.println(a);
		System.out.println(a.length());
		
				
		
		
	}
	
	
	public static boolean isPalindrome(String a) {
		
		
		//Caso base
		
		//Menor unidade que posso retornar
		
		//A recursão irá parar quando chegar no caso base
		
		if(a.length()==0 || a.length()==1) {
			
			return true;
		}
		
	    //O caso recursivo não precisa necessariamente ser um else
		
	    //Depois de fazer essas pergunta para definir o caso base
		
	    //Temos que definir nosso algoritmo de recursão
	
	    //Para isso , perguntamos qual é a menor quantidade 
	    // de trabalho com a qual posso contribuir para chegar ao caso base
		
		if(a.charAt(0)==a.charAt(a.length()-1)) {
			
			return isPalindrome(a.substring(1,a.length()-1));
					
					
		}
		
		
		return false;
		
	}
	
	
	
	
}
