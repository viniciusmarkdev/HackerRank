package Exerc�cios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AmpulhetaArrayList {
	
	 public static void main(String[] args) throws IOException {
	     
		 //Entrada de dados
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        //Lista de listas
		 
		 int maxSum = Integer.MIN_VALUE;
	        List<List<Integer>> arr = new ArrayList<>();
	        
	        for (int i = 0; i < 6; i++) {
	         
	     String[] arrRowTempItems = bufferedReader.readLine().split(" ");

	     List<Integer> arrRowItems = new ArrayList<>();
	            

	            for (int j = 0; j < 6; j++) {
	             
	            	int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }

	            arr.add(arrRowItems);
	        }

	        bufferedReader.close();
	        
	
	        int sum=0;
	        for(int i=0;i<4;i++) {
	        	
	        	for(int j=0 ; j<4;j++) {
	        
	        //m�todo get da interface List , respos�vel por
	        // pegar o �ndice de um valor no array
	        sum=arr.get(i).get(j)+
	        	arr.get(i).get(j+1)+
	            arr.get(i).get(j+2)+
	            arr.get(i+1).get(j+1)+
	            arr.get(i+2).get(j)+
	            arr.get(i+2).get(j+1)+
	            arr.get(i+2).get(j+2);
	        		   
	           maxSum = Math.max(maxSum, sum);
	          
	        		
	        	}
	        }
	        
	        System.out.println(maxSum);
	        
	    }
	}


