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
		
		//Matriz
		
		double [][] notaAlunos = new double[3][4];
		
		notaAlunos[0][0] = 9.0;
		notaAlunos[0][1] = 8.0;
		notaAlunos[0][2] = 6.0;
		notaAlunos[0][3] = 4.0;
		
		notaAlunos[1][0] = 9.0;
		notaAlunos[1][1] = 8.0;
		notaAlunos[1][2] = 6.0;
		notaAlunos[1][3] = 4.0;
		
		notaAlunos[2][0] = 6.0;
		notaAlunos[2][1] = 2.0;
		notaAlunos[2][2] = 4.0;
		notaAlunos[2][3] = 10.0;
	
		
		System.out.println(notaAlunos.length);
		
		System.out.println();
	
		for(int i =0 ; i<notaAlunos.length ; i++) {
			
			for(int j=0; j<notaAlunos[i].length;j++) {
				
				System.out.print(notaAlunos[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		//Media
		
		System.out.println("Calculando a media da nota de cada aluno ");
		System.out.println();
		
		double[][]notaAlunos2 = {{1,2,3,4},{1,2,3,4}};
		double soma;
        for(int i =0 ; i<notaAlunos2.length ; i++) {
			
        	soma = 0;
			for(int j=0; j<notaAlunos2[i].length;j++) {
				
				soma+=notaAlunos2[i][j];
			}
			
			System.out.println("A nota do aluno "+(1+i)+ " é = "+soma/4);
			
		}
	}

}
