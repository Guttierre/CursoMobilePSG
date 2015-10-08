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

		System.out.println("Olá, digite a primeira nota do aluno: ");
		n1 = leitura.nextDouble();

		System.out.println("Olá, digite a segunda nota do aluno: ");
		n2 = leitura.nextDouble();

		System.out.println("Olá, digite a terceira nota do aluno: ");
		n3 = leitura.nextDouble();

		media = (n1 + n2 + n3) / 3;

		System.out.println("A Media do aluno(a) "+aluno+" é: " + media);

		if (media >= 7) {
			System.out.println("Aluno(a) "+aluno+" está APROVADO!");
		} else if (media >= 6) {
			System.out.println("Aluno(a) "+aluno+" está de RECUPERAÇÃO");
		} else {
			System.out.println("Aluno(a) "+aluno+" está REPROVADO!");
		}

		leitura.close();

	}

}
