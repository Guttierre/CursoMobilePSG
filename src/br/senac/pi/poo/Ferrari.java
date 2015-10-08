package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Carro c1 = new Carro();
			
			c1.marca = "Ferrari";
			c1.modelo = "Enzo";
			c1.chassi = "F102030";
			c1.ano = 2010;
			
			System.out.println("Marca: "+c1.marca);
			System.out.println("Modelo: "+c1.modelo);
			System.out.println("Chassi: "+c1.chassi);
			System.out.println("Ano: "+c1.ano);
			System.out.println("");
			
			c1.partida();
			c1.acelerar();
			c1.freiar();
			
			
	}

}
