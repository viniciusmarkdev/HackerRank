package Exercícios;

import java.util.Scanner;

public class StringInit {
	
       public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int somaTamanhoStrings = A.length() + B.length();
        System.out.println(somaTamanhoStrings);
        
        if(A.compareTo(B)>0) {
        	
        	System.out.println("Yes");
        }else {
        	
        	System.out.println("No");
        }
        
        System.out.print(A.toUpperCase().charAt(0)+ (A.substring(1,A.length())+" "));
        
        System.out.println(B.toUpperCase().charAt(0)+ (B.substring(1,B.length())));
        
        
    }

}
