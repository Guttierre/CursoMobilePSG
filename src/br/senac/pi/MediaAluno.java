package br.senac.pi;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		double media, n1, n2, n3;
		String aluno;
		
		System.out.println("Insira o nome do Aluno");
		aluno = leitura.next();

		System.out.println("Ol�, digite a primeira nota do aluno: ");
		n1 = leitura.nextDouble();

		System.out.println("Ol�, digite a segunda nota do aluno: ");
		n2 = leitura.nextDouble();

		System.out.println("Ol�, digite a terceira nota do aluno: ");
		n3 = leitura.nextDouble();

		media = (n1 + n2 + n3) / 3;

		System.out.println("A Media do aluno(a) "+aluno+" �: " + media);

		if (media >= 7) {
			System.out.println("Aluno(a) "+aluno+" est� APROVADO!");
		} else if (media >= 6) {
			System.out.println("Aluno(a) "+aluno+" est� de RECUPERA��O");
		} else {
			System.out.println("Aluno(a) "+aluno+" est� REPROVADO!");
		}

		leitura.close();

	}

}
