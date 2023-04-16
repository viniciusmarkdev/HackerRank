package Exercícios;

public class fibonnaci {
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(3));
		
	}
	
	
	public static int fibonacci(int n) {
		
		if(n==0 || n==1) {
			
			return n;
		}
		
		int a=0;
		
		int b=1;
		
		for(int i=2 ; i<=n; i++) {
			
			int c = a+b;
			a=b;
			b=c;
		}
		
		return b;
	}

}
