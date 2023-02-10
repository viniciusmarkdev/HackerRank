package Exercícios;

import java.util.Scanner;

public class Anagram {
	
	

    static boolean isAnagram(String a, String b) {
       
    	a.toUpperCase();
    	b.toUpperCase();
    	char [] separarA = a.toCharArray();
    	char [] separarB = b.toCharArray();
    	boolean ret = false;
    	int k = 0 ;
    	
    	
    
    	for(int i = 0 ; i<a.length();i++) {
    		
    		
    		for(int j = 0 ; j<b.length(); j++) {
    			
    			if(separarA[i]==separarB[j]) {
    				
    				k++;
    				
    				
    				
    				
    				
    			}
    			
    		   
    			
    			if(k==a.length() && k==b.length() ) {
    				
    				ret = true;
    				
    			}
    			
    			
    			
    		}
    		

			
    	}
    	
    	
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
