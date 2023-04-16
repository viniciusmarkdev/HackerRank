package Exercícios;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		
		convert(1000000000);
		
		
	}
	
	static List<Integer>  numerosBinarios = new ArrayList<Integer>();
		
	
	   
		public static void convert(int n ) {
			
			
			
		
			
		
				for( int  i=0 ; n>0; i++) {
				
			   
				
							 
				 if(n%2==1) {
					 
					 numerosBinarios.add(1);
				 }
								
				 else if(n%2==0) {
					
					numerosBinarios.add(0);
					
				}
			
				
				
				
				 n=n/2;
				 
				 
			
				
			
				 
			
			}
				
				

				
			
				   
			
				
	 
			 
			StringBuilder concat = new StringBuilder("");
			
			
			
			
			
			for( int i=0 ; i<numerosBinarios.size() ; i++) {
				
				concat.append(numerosBinarios.get(numerosBinarios.size()-1-i));
			}
			
		
			System.out.println(concat);
	}
		
		

}
