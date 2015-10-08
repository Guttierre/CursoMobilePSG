package br.senac.pi;

import java.util.Scanner;

public class Cargos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cargo;
		double salario;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o cargo do funcionario conforme tabela abaixo: ");
		System.out.println("1 - Gerente");
		System.out.println("2 - Coordenador");
		System.out.println("3 - Supervisor");
		System.out.print("Cargo: ");

		cargo = leitura.nextInt();

		System.out.println("Digite o salario: ");

		salario = leitura.nextDouble();

		if (cargo == 1) {
			salario = salario + (salario * 0.25);
			System.out.println("O Valor Total do Salario com o bonus é de: " + salario);
		} else if (cargo == 2) {
			salario = salario + (salario * 0.10);
			System.out.println("O Valor Total do Salario com o bonus é de: " + salario);
		} else if (cargo == 3) {
			salario = salario + (salario * 0.08);
			System.out.println("O Valor Total do Salario com o bonus é de: " + salario);
		}

		

		leitura.close();

	}

}
