package br.senac.pi;

import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {
		System.out.println("ol�");
		System.out.print("Digite um n�mero: ");
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();
		System.out.println("Valor: " + valor);
		s.close();

	}
}
