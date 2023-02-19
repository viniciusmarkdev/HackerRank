package Exercícios;

import java.util.Scanner;

public class RegexIp {
	
	  public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }

}


class MyRegex{
	
	
	 String reg = "(([01]?\\d{1,2})|(2[0-4]\\d)|(25[0-5]))"; 

	  String pattern = String.format("%s.%s.%s.%s", reg, reg, reg, reg);
	
}
