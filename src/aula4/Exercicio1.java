package aula4;

import java.util.Scanner;

//Crie um programa para simular uma urna de votação para exatamente 3 candidatos.  
//Logo no início deve-se perguntar ao usuário os nomes dos candidatos.  Permita votos em branco.  
//Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de cada candidato. 
//Apresente também a quantidade e o percentual dos votos em branco e quem foi o ganhador da eleição.  
//Para este exercício desta vez vamos refazer o exercício da votação agora orientado a objetos. 
//Tentem utilizar os conceitos que vimos em sala (responsabilidades, atributos e comportamentos, 
//encapsulamento...), para montar de forma orientada a objetos todo o programa de votação.
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		getInputCandidato(input);
		getQuantidadeVotos(input);
		getComputaVotos(input);
		
		input.close();
	}
	private static void getComputaVotos(Scanner input) {
		Urna urna = new Urna();
		int quantidadeVotos = urna.getQuantidateVotos();
		for(int j = 1; j <= quantidadeVotos; j++){
			System.out.println("");
			System.out.print("Entre com o " + j + "º voto da urna: ");
			String votoNomeCandidato = input.next();
			urna.setVoto(votoNomeCandidato);
		}
	}
	private static void getQuantidadeVotos(Scanner input) {
		Urna urna = new Urna();
		System.out.print("Entre com o nº de votos totais da urna: ");
		int quantidadeVotos = input.nextInt();
		urna.setQuantidateVotos(quantidadeVotos);
	}
	
	private static void getInputCandidato(Scanner input) {
		for(int i = 1; i <= 3; i++){
			//Candidatos candidato[i] = new Candidatos();
			System.out.print("Entre com o nome do " + i + "º candidato: ");
			String nomeCandidato = input.next(); 
			//candidato[i].setCandidato(nomeCandidato);
		}
	}	
}