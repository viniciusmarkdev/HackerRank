package Exerc�cios;

import java.util.Scanner;

public class staticInitialization {
	/*
	 * V�riaveis est�ticas que s�o inicializadas antes 
	 * de tudo.
	 * */
	static boolean flag = true;
	static int B, H;

	/*Bloco est�tico inicializado 
	 * 
	 * Os Blocos est�ticos servem para que possamos inicializar 
	 * var�aveis j� com algum tratamento de erros ou looping.
	 * 
	 * Assim como fazemos com construtores com sua L�gica interna.
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
	     * Se isso B for < 0 e H < 0 n�o iremos executar o c�digo 
	     * do m�todo main e imprimiremos a exce��o. Pois o c�digo 
	     * do main s� roda caso a flag seja verdadeira.
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



 
		  
		  
		  
	 
 
 

	

