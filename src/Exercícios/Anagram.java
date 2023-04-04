
package Exercícios;

import java.util.Scanner;

public class Anagram {
	
	

    static boolean isAnagram(String a, String b) {
       
     	String A = a.toUpperCase();
     	String B = b.toUpperCase();
    	
    	char [] separarA = A.toCharArray();
    	char [] separarB = B.toCharArray();
    	boolean ret = false;
    	int k = 0 ;
    	int l = 0 ;
    	
    	int m = 0;
    	
    	


    	
    	
    	
    	
    	
    	for(int p=0 ; p< A.length() ; p++) {
    		
    		
    		
    		for(int q = p+1 ; q< A.length() ; q++) {
    			
    			
    			if(separarA[p] == separarA[q]) {
    				
    				m++;
    				
    				
    			}
    			
    		
    		}
    		
    		
    	
    		
    		
        	
        	
        	
    		
    		
    	
    		
    	}
    	
    	
    	for(int r=0 ; r< B.length() ; r++ ) {
			
			
			for(int s = r+1; s<B.length() ; s++) {
				
				
				if(separarB[r] == separarB[s]) {
    				
    				l++;
    				
    				
    			}
				
				
			}
			
		}
    	
    	
    	
    
    	
    	
    
    	for(int i = 0 ; i<A.length();i++) {
    		
    		for(int j = 0 ; j<B.length(); j++) {
    			
    			if(separarA[i]==separarB[j]) {
    				
    				k++;
    				}
    			
    		
    			
    			
    		   
    			
    			if(k==A.length() && k==B.length() && l==m  ) {
    				
    				ret = true;
    				
    			}
    			
    			
    			
    			
    			
    		}
    		

			
    	}
    	
    	System.out.println(m);
    	System.out.println(l);
    	
    	return ret;
    }
	
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        
        
       
        
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
    }
	

}
