package Exercícios;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		 List<List<Integer>> arr = new ArrayList<>();
		 
		 List<Integer> str = new ArrayList<>();
		 List<Integer> inteiros = new ArrayList<>();
		
		 arr.add(str);
		 arr.add(inteiros);
		 str.add(1);
		 str.add(2);
		 str.add(3);
		 inteiros.add(0);
		 
		 System.out.println(arr);
		 
		 
		 
		 
		 
		 
	}

}
