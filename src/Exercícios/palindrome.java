package Exercícios;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		
       
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] separar = A.toCharArray();
        int j =0;
        int k = 0;
        for(int i = 0 ; i<A.length();i++) {
        	
        	
        	j++;

        	if(separar[i]==separar[A.length()-j]) {
        		
        		k++;
        		        		
        	}
        	
        	
        }
        
        if(k==A.length()) {
    		
    		System.out.println("Yes");
    	}else {
    		
    		System.out.println("No");
    	}
		
		
	
	}
	

}
