package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crie um programa para simular uma urna de vota��o para exatamente 3 candidatos.  
//Logo no in�cio deve-se perguntar ao usu�rio os nomes dos candidatos.  Permita votos em branco.  
//Ao t�rmino de toda a entrada, apresente o nome, a quantidade de votos e o percentual de cada candidato. 
//Apresente tamb�m a quantidade e o percentual dos votos em branco e quem foi o ganhador da elei��o.  
//Para este exerc�cio desta vez vamos refazer o exerc�cio da vota��o agora orientado a objetos. 
//Tentem utilizar os conceitos que vimos em sala (responsabilidades, atributos e comportamentos, 
//encapsulamento...), para montar de forma orientada a objetos todo o programa de vota��o.
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
			//System.out.print("Entre com o " + j + "� voto da urna: ");
			//String votoNomeCandidato = input.next();
			//Candidatos.setVotoCandidato();
		//}
	}
	
	private static void getQuantidadeVotos(Scanner input) {
		Urna urna = new Urna(0);
		System.out.print("Entre com o n� de votos totais da urna: ");
		int quantidadeVotos = input.nextInt();
		urna.setQuantidateVotos(quantidadeVotos);
	}
	
	private static void getInputCandidato(Scanner input) {
		System.out.print("Entre com o nome do 1� candidato: ");
		String nomeCandidato1 = input.next();
		Candidatos candidato1 = new Candidatos(nomeCandidato1,1);
		
		System.out.print("Entre com o nome do 2� candidato: ");
		String nomeCandidato2 = input.next();
		Candidatos candidato2 = new Candidatos(nomeCandidato2,2);
		
		System.out.print("Entre com o nome do 3� candidato: ");
		String nomeCandidato3 = input.next();
		Candidatos candidato3 = new Candidatos(nomeCandidato3,3);
		
		List<Candidatos> candidato = new ArrayList<Candidatos>();
		
		candidato.add(candidato1);
		candidato.add(candidato2);
		candidato.add(candidato3);
	}	
}