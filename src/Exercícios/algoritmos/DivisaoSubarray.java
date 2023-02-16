package Exercícios.algoritmos;

import java.util.ArrayList;
import java.util.List;

public class DivisaoSubarray {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		birthday(a , 1, 3 );
		
	}
	
	
	  public static int birthday(List<Integer> s, int d, int m) {
		    // Write your code here
		 
		  int soma =0;
		  if(d>=1 && d<=31 && m>=1 && m<=12 ) {
			  
			 for(int k = 0; k<s.size()-1 ;k++){
			  
		 for(int i =0 ; i<s.size() ; i++) {
				
				 
				 
			 for(int j =i+m; j<=s.size(); j++ ) {
					  
			
		 System.out.println( s.subList(i++, j).get(k));
					
				 
					 
				  }
				  
			  }
				  
			  }
		  }
		return m;

		    }

}
