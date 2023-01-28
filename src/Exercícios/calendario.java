package Exerc�cios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class calendario {
	
	public static void main(String[] args) {
		
		findDay(28,01,2023);
	}
	
	public static String findDay(int day ,int month , int year) {
		
		/*Pegar a data de hoje */
		Calendar data = Calendar.getInstance();
		/*O set , m�todo da classe Abstrata Calendar,� respons�vel 
		 * por mudar a data Inst�nciada.
		 * 
		 * �  preciso colocar um o campo que queremos mudar(field) e 
		 * o valor que queremos colocar
		 * 
		 * */
		
		/*O m�s come�a com 0*/
		data.set(Calendar.MONTH , month-1);
		data.set(Calendar.DAY_OF_MONTH, day);
		data.set(Calendar.YEAR,year);
		
		
		
		if(Calendar.DAY_OF_MONTH == 28) {
			
			String nome = "S�BADO";
			System.out.println(nome);
		}
		
		/*
		 * O m�todo displayName retorna a representa��o do campo que 
		 * queremos em String.Por exemplo , se queremos saber como
		 * � a representa��o de m�s 1 , que � Janeiro podemos usar 
		 * esse m�todo , tamb�m para dias da semana.
		 * 
		 * No m�todo tambem � passado o Estilo(Long ou Short) e O local(Locale.US)
		 * 
		 * */
		
/*
 * 
 * 
 * 
 * 
 * */		
		String dayOfWeek = data.getDisplayName(Calendar.DAY_OF_WEEK, 
				Calendar.LONG, Locale.US).toUpperCase();
		String nomeDoM�s = data.getDisplayName(Calendar.MONTH, 
			Calendar.LONG, Locale.US).toUpperCase();
		
		
		System.out.println(nomeDoM�s);
        System.out.println(dayOfWeek);
      
       
		return dayOfWeek;
		
		
	}
	
}
