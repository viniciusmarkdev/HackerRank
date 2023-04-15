package Exercícios;

public class Sum {
	
	public static void main(String[] args) {
		
		System.out.println(soma(1));
		
	}
	
	
	public static int soma(int n) {
		
		int soma=0;
		for(int i=0 ; i<=n ; i++) {
			
			soma+=i;
		}

		return soma;
	}
	

}
