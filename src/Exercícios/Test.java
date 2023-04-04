package Exercícios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	double valor ;
	
	public boolean aplicaDesconto(double porcentagem) {
		
		if(porcentagem>0.3) {
			
			return false;
		}
		
		this.valor -=this.valor*porcentagem;
		return true;
	}
		
	public static void main(String[] args) {
		
		Test test = new Test();
			
		System.out.println(!test.aplicaDesconto(0.1));
	     
	}

}
