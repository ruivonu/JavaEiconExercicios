package aula4;

import java.util.ArrayList;
import java.util.List;
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
		
		//for(int j = 1; j <= quantidadeVotos; j++){
			System.out.println("");
			//System.out.print("Entre com o " + j + "º voto da urna: ");
			//String votoNomeCandidato = input.next();
			//Candidatos.setVotoCandidato();
		//}
	}
	
	private static void getQuantidadeVotos(Scanner input) {
		Urna urna = new Urna(0);
		System.out.print("Entre com o nº de votos totais da urna: ");
		int quantidadeVotos = input.nextInt();
		urna.setQuantidateVotos(quantidadeVotos);
	}
	
	private static void getInputCandidato(Scanner input) {
		System.out.print("Entre com o nome do 1º candidato: ");
		String nomeCandidato1 = input.next();
		Candidatos candidato1 = new Candidatos(nomeCandidato1,1);
		
		System.out.print("Entre com o nome do 2º candidato: ");
		String nomeCandidato2 = input.next();
		Candidatos candidato2 = new Candidatos(nomeCandidato2,2);
		
		System.out.print("Entre com o nome do 3º candidato: ");
		String nomeCandidato3 = input.next();
		Candidatos candidato3 = new Candidatos(nomeCandidato3,3);
		
		List<Candidatos> candidato = new ArrayList<Candidatos>();
		
		candidato.add(candidato1);
		candidato.add(candidato2);
		candidato.add(candidato3);
	}	
}