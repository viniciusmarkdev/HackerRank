package Exercícios;

import java.util.Scanner;

	


public class Formatacao {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x= sc.nextInt();
                //Complete this line
                 int len = s1.length();
                 String space = "";
                 for(int j=0;j<15-len;j++){
                     space = space+" ";
                 }
                 System.out.print(s1+space);
                 System.out.printf(String.format("%03d",+x));
                 System.out.println("");
            }
            System.out.println("================================");

    }
}



