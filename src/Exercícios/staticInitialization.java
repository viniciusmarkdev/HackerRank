package Exercícios;

import java.util.Scanner;

public class staticInitialization {
	/*
	 * Váriaveis estáticas que são inicializadas antes 
	 * de tudo.
	 * */
	static boolean flag = true;
	static int B, H;

	/*Bloco estático inicializado 
	 * 
	 * Os Blocos estáticos servem para que possamos inicializar 
	 * varíaveis já com algum tratamento de erros ou looping.
	 * 
	 * Assim como fazemos com construtores com sua Lógica interna.
	 * 
	 * */
	static {
	    
	    Scanner scan = new Scanner(System.in);
	    B = scan.nextInt();
	    scan.nextLine();
	    H = scan.nextInt();
	    scan.close();
	    
	    
	    if(B>0 && H>0){
	        flag = true;
	    }
	    /*
	     * Se isso B for < 0 e H < 0 não iremos executar o código 
	     * do método main e imprimiremos a exceção. Pois o código 
	     * do main só roda caso a flag seja verdadeira.
	     * 
	     * 
	     * */
	    else if(B<=0 || H <=0){
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	}

	public static void main(String[] args){
	        if(flag){
	            int area=B*H;
	            System.out.print(area);
	        }
	        
	    }//end of main

	}//end of class



 
		  
		  
		  
	 
 
 

	

