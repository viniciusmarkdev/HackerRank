package Exercícios;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		
		convert(1);
		
		
	}
	
	static List<Integer>  numerosBinarios = new ArrayList<Integer>();
		
	
	   
		public static void convert(int n ) {
			
			
			int aux = n;
			
		
			
		
				for( int  i=0 ; i<=n; i++) {
				
			   
				
							 
				 if(n%2==1) {
					 
					 numerosBinarios.add(1);
				 }
								
				if(n%2==0) {
					
					numerosBinarios.add(0);
					
				}
			
				
				
				
				 n=n/2;
				 
				 
				 
				 if(i>n && n%2==0) {
					 
					 
						numerosBinarios.add(0);
					 
				 }
				 
				 if(i>n && n%2==1 ) {
					 
					 
						numerosBinarios.add(1);

					
						
					 
				 }
				 
				 
				 if(i==n && n%2==1 ) {
					 
					 
						numerosBinarios.add(1);

					
						
					 
				 }
				 
				 if(i==n && n%2==0) {
					 
					 
						numerosBinarios.add(0);
						

					
						
					 
				 }
				 
				 
				 
				 
				    
				
				
			
				 if(i==n) {
						
					   int one= n=n/2;
					    
					    if(one== 1) {
					    	
					    	numerosBinarios.add(1);
					    	
					    }
					    
					
					    
					
					    
					    
					  
					    
					   
						break;
						
						
					}
				 
				
			
				 
			
			}
				
				

				
				 String convertToString = String.valueOf(aux);
				    
				    if( convertToString.length()==2 ||  convertToString.length()==3   
				    		&& aux>=64 
				    		 ) {
				    	
				    	numerosBinarios.add(1);
				    }
			
				
	 
			 
			StringBuilder concat = new StringBuilder("");
			
			
			
			
			
			for( int i=0 ; i<numerosBinarios.size() ; i++) {
				
				concat.append(numerosBinarios.get(numerosBinarios.size()-1-i));
			}
			
		
			System.out.println(concat);
	}
		
		

}
