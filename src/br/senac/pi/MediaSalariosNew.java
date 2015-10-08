package br.senac.pi;

import java.util.Scanner;

public class MediaSalariosNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		
		int quantidade,soma;
		double salario;
		
		soma = 0;
		
		System.out.println("Digite a quantidade de funcionarios da empresa: ");
		quantidade = leitura.nextInt();
	
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Informe o salario do "+i+"º funcionario: ");
			salario = leitura.nextDouble();
			soma +=salario;
		}
		
		double media = soma/quantidade;
		System.out.println("Total de funcionarios: "+quantidade);
		System.out.println("A Media salarial da empresa é: "+media);	
		
		
		leitura.close();
	}
	
	
}
