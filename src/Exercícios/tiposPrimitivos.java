package Exerc�cios;

import java.io.*;
import java.util.Scanner;



class tiposPrimitivos{
   
	public static void main(String []arg) {
    	
    	
    


    	        Scanner sc = new Scanner(System.in);
    	        int t=sc.nextInt();
    	        
    	        
    	        for(int i=0;i<t;i++)
    	        {

    	        	try
    	        	{
    	        		
    	        		
    	        		long x=sc.nextLong();
    	        		long min_long = Long.parseLong("-9223372036854775808"), max_long = Long.parseLong("9223372036854775807");
    	        		System.out.println(x+" can be fitted in:");
    	        	
    	        		if(x>=-128 && x<=127)System.out.println("* byte");
    	        	
    	        		
    	        		if(x>=-32768 && x<=32767)System.out.println("* short");
    	        	
    	        		if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
    	        	
    	        		if(x>=min_long && x<=max_long)System.out.println("* long");
    	        	}
    	        	catch(Exception e)
    	        	{
    	        		System.out.println(sc.next()+" can't be fitted anywhere.");
    	        	}

    	        }		

    	     
    	}
    	           
    	     


    	
    	
    }
    
