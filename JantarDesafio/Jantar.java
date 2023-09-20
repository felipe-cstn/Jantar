package JantarDesafio;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {

		Comida c1 = new Comida();
		Comida c2 = new Comida();
		Pessoa p =  new Pessoa();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
		String nomePessoa = entrada.nextLine();
		System.out.println("Informe o peso do cliente: ");
		double pesoPessoa = entrada.nextDouble();
		
		
		
		System.out.println("Comida: " + c1.nome);
		System.out.println("Peso: " + c1.peso);
		System.out.println("Nome do cliente: " + p.nome );
		System.out.println("Peso do cliente: " + p.peso);
		
	
	}
}
