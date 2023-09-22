package JantarDesafio;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
			String nomePessoa = entrada.nextLine();
		
		System.out.println("Informe o peso do cliente: ");
			double pesoPessoa = entrada.nextDouble();
		
		System.out.println("Informe o nome da comida: ");
			String nomeComida = entrada.next();
		
		System.out.println("Informe o peso da comida: ");
			double pesoComida = entrada.nextDouble();
		
		
		Pessoa p =  new Pessoa(nomePessoa, pesoPessoa, pesoComida);
		Comida c1 = new Comida(nomeComida, pesoComida);
		
		System.out.printf("\n=======PEDIDO DO CLIENTE=======");
		System.out.printf("\n\n");
		System.out.println("Comida: " + c1.nome);
		System.out.println("Peso: " + c1.peso);
		System.out.println("Nome do cliente: " + p.nome );
		System.out.println("Peso do cliente: " + p.peso);
		
		System.out.printf("\n\nPeso do cliente + peso da comida: ");
		System.out.printf("\nPeso final do cliente: %.2f",  p.comer());
		
		System.out.println("\nAlgumas horas após a refeição");
		System.out.println("\no cliente sentiu vontade de cagar,");
		System.out.printf("\nE esse é o seu peso após cagar: %.2f ", p.cagar());
		
	entrada.close();
}
