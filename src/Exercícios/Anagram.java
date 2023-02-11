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
    	int l = 0 ;
    	
    	int m = 0;
    	
    	
    	for(int p=0 ; p< a.length() ; p++) {
    		
    		
    		
    		for(int q = p+1 ; q< a.length() ; q++) {
    			
    			
    			if(separarA[p] == separarA[q]) {
    				
    				m++;
    				
    				
    			}
    			
    			if(separarB[p]==separarB[q]) {
    				
    				l++;
    			}
    		
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    
    
    	for(int i = 0 ; i<a.length();i++) {
    		
    		for(int j = 0 ; j<b.length(); j++) {
    			
    			if(separarA[i]==separarB[j]) {
    				
    				k++;
    				
    				
    			}
    			
    			
    			
    		
    		
    			
    			
    		   
    			
    			if(k==a.length() && k==b.length() && l==m  ) {
    				
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
