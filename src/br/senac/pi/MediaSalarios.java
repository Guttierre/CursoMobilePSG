package br.senac.pi;

import java.util.Scanner;

public class MediaSalarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitura = new Scanner(System.in);
		
		double salarios;
		int funcionarios;
		
		System.out.println("Olá, Digite a quantidade de funcionarios: ");
		
		funcionarios = leitura.nextInt();
		
		System.out.println("Agora digite o valor total do salario dos funcionarios");
		
		salarios = leitura.nextDouble();
		
		System.out.println("Media de salarial da empresa: "+salarios / funcionarios);
		
		leitura.close();
		
		
	}

}
