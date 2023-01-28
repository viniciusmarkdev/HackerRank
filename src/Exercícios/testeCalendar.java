package Exercícios;

import java.util.Calendar;

public class testeCalendar {
	
	
	public static void main(String[] args) {
		
		
		Calendar teste = Calendar.getInstance();
		
		int diaSemana = Calendar.DAY_OF_WEEK;
		
		System.out.println(diaSemana);
		
		if(diaSemana==7) {
			
			System.out.println("Hoje é SATURDAY");
		}
	}

}
