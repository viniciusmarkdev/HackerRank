package Exercícios;

import java.util.Scanner;
import java.util.regex.Pattern;

public class teste {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a[][] = new int[6][6];

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6; j++) {

				a[i][j] = entrada.nextInt();

			}

		}

		for (int i = 0; i < 6; i++) {

			System.out.println();

			for (int j = 0; j < 6; j++) {

				System.out.print(a[i][j] + " ");

			}

		}

		int soma = 0;

		for (int i = 0; i < 6; i++) {

			System.out.println();

			for (int j = i + 1; j < 6 - i; j++) {

				soma = soma + a[i][j];

			}

			i = i + 1;

		}

		System.out.print(soma);
		System.out.println();

	}

}
