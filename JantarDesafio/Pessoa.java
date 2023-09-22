package JantarDesafio;

public class Pessoa {
	
	 String nome;
		double peso;
		double pesoComida;
		
		Pessoa(String nomePessoa, double pesoPessoa, double pesoComida){
			nome = nomePessoa;
			peso = pesoPessoa;
			this.pesoComida = pesoComida;
		}
		
		
		public double comer() {
			double pesoFinal = this.pesoComida + peso;
			return pesoFinal;
		}
		
		public double cagar() {
			double pesoFinal = peso - this.pesoComida;
			return pesoFinal;
		}
}
