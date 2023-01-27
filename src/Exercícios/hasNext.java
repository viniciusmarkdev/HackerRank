package Exercícios;

import java.util.Scanner;

public class hasNext {
	
	
	public static void main(String[] args) {
		
		String s = "Olá , aqui é Javapoint";
		int i = 0;
		
		Scanner Varredura = new Scanner(s);
		
		System.out.println("Resultado  " + Varredura.hasNext());
		
		System.out.print(i++);
		System.out.print("");
		System.out.println("String  " + Varredura.nextLine());
		
		System.out.println("Resultado Final  "+  Varredura.hasNext());
		
		


}
}