package Exercícios;

public class MatrizDimensional {
	
	
	public static void main(String[] args) {
		
		
		//Arrays
		//Armazenar a temperatura diaria em um ano
		
		double [] temperatura = new double[365];
		temperatura[0]= 32.1;
		temperatura[1]=24.2;
		temperatura[2]=28.2;
		temperatura[3] = 28.8;
		
		System.out.println("A temperatura no dia 1 : é "+ temperatura[0]
				+"graus");
		
		System.out.println("O tamanho do nosso Array é de : " +
				temperatura.length );
		
		for(int i=0 ; i<temperatura.length ;i++) {
			
			System.out.println("A temperatura no dia "+(i+1)+ " é de "
					+temperatura[i] + " graus");
	}
		
		System.out.println();
		
		for(double temp : temperatura) {
			
			System.out.println(temp);
		}

	}

}
