package Exercícios;

import java.util.Scanner;

public class CompareString {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = " ";

		for (int i = 0; i <s.length(); i++) {

			
			for( int j=0 ; j<s.length() ; j++) {
				
				
				if(s.substring(i,k).compareTo(s.substring(j,k))>0) {
					
					
				   System.out.println(s.substring(i,k));
				  
				
					
				}
				
				
			}
			
		
				
				
				
			
		
		

		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
		
		
	}
}
