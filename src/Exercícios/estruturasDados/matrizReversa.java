package Exercícios.estruturasDados;

import java.util.ArrayList;
import java.util.List;

public class matrizReversa {
	

		
	public static void main(String[] args) {
		
		
		List<Integer> a = new ArrayList<>();
     	a.add(1);
     	a.add(2);
     	a.add(3);
     	a.add(4);
     	
     	System.out.println(reverseArray(a));
     	
	}
	
	
public static List<Integer> reverseArray(List<Integer>a){
			
			 
	    int i = 0;
			
		List<Integer> reversao = new ArrayList<Integer>();
			
			  for( Integer array : a ) {
	
				 
				
	System.out.println(reversao.add(a.get(a.size()-1-i)));	  

 
           

			
				 
				  i++;
				  
				  
				  			  
			  }
			return reversao;
			
			  
					 
			
		}

	}

