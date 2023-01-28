package Exercícios.estruturasDados;

import java.util.ArrayList;
import java.util.List;

public class matrizReversa {
	
	
	
		
		public static List<Integer> reverseArray(List<Integer>a){
			
			 
			int i = 0;
			
		List<Integer> reversao = new ArrayList<Integer>();
			
			  for( Integer array : a ) {
	
				 
				
				  

 
 reversao.add(a.get(a.size()-1-i));

			
				 
				  i++;
				  
				  
				  			  
			  }
			return reversao;
			
			  
					 
			
		}

	}

