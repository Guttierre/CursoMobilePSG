package br.senac.pi;

public class OperacoesDados {
public static void main(String[] args) {
	
	String nome="Ivan";
	String sobrenome="Rodrigues";
	
	System.out.println("Nome Completo: " +nome + sobrenome);
	
	System.out.println("--------------------------------------");
	
	int idade=20;
	boolean brasileiro=true;
	System.out.println("Idade: " +idade);
	if(brasileiro==true)
	{
	System.out.println("Brasileiro: SIM" );
	}
	
	System.out.println("\nOperações Matemáticas:");
	int n1=10,n2=5;
	System.out.println("O valor de n1 é: " +n1+ "\nO Valor de n2 é: " +n2);
	System.out.println("A soma entre n1 e n2 é: " + (n1+n2));
	System.out.println("A multiplicação entre n1 e n2 é: " + n1*n2);
	System.out.println("A subtração entre n1 e n2 é: " + (n1-n2));
	System.out.println("A divisão entre n1 e n2 é: " + n1/n2);
	System.out.println("O resto entre n1 e n2 é: " + n1%n2);
}
}
