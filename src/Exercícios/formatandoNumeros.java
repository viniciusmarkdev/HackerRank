package Exercícios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class formatandoNumeros {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        // Write your code here.
	        
	    NumberFormat moeda =  NumberFormat.getCurrencyInstance(Locale.US);
	            String us = moeda.format(payment);
	    moeda =  NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	            String india = moeda.format(payment);
	             moeda =  NumberFormat.getCurrencyInstance(Locale.CHINA);
	            String china = moeda.format(payment);
	            
	            String france = 
	        
	        NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	}