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
	
	System.out.println("\nOpera��es Matem�ticas:");
	int n1=10,n2=5;
	System.out.println("O valor de n1 �: " +n1+ "\nO Valor de n2 �: " +n2);
	System.out.println("A soma entre n1 e n2 �: " + (n1+n2));
	System.out.println("A multiplica��o entre n1 e n2 �: " + n1*n2);
	System.out.println("A subtra��o entre n1 e n2 �: " + (n1-n2));
	System.out.println("A divis�o entre n1 e n2 �: " + n1/n2);
	System.out.println("O resto entre n1 e n2 �: " + n1%n2);
}
}
