package Exercícios;

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
		/*O set , método da classe Abstrata Calendar,é responsável 
		 * por mudar a data Instânciada.
		 * 
		 * É  preciso colocar um o campo que queremos mudar(field) e 
		 * o valor que queremos colocar
		 * 
		 * */
		
		/*O mês começa com 0*/
		data.set(Calendar.MONTH , month-1);
		data.set(Calendar.DAY_OF_MONTH, day);
		data.set(Calendar.YEAR,year);
		
		
		
		if(Calendar.DAY_OF_MONTH == 28) {
			
			String nome = "SÁBADO";
			System.out.println(nome);
		}
		
		/*
		 * O método displayName retorna a representação do campo que 
		 * queremos em String.Por exemplo , se queremos saber como
		 * é a representação de mês 1 , que é Janeiro podemos usar 
		 * esse método , também para dias da semana.
		 * 
		 * No método tambem é passado o Estilo(Long ou Short) e O local(Locale.US)
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
		String nomeDoMês = data.getDisplayName(Calendar.MONTH, 
			Calendar.LONG, Locale.US).toUpperCase();
		
		
		System.out.println(nomeDoMês);
        System.out.println(dayOfWeek);
      
       
		return dayOfWeek;
		
		
	}
	
}
