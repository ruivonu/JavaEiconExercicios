package aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Eleicao {
	public static void eleicao(){
		ArrayList<Candidatos> arrayList = new ArrayList<Candidatos>();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de candidatos que participarão da eleição:");
		int quantidadeCandidatos = input.nextInt();
		int i = 1;
		do{
			System.out.println("Digite o nome do " + i + "º Candidato: ");
			Candidatos parseCandidato = parseCandidatosNome(input.next());
			parseCandidato.setId(i);
	        arrayList.add(parseCandidato);
	        i++;
		}while (i <= quantidadeCandidatos);
		System.out.println("Escolha uma opção abaixo:");
		ProcessaVotos.processaVotos(arrayList);
		input.close();
		System.out.println("votacao encerrada");
		for (Candidatos candidato : arrayList) {
			if(candidato.getId() == AnaliseVotos.getVencendor()){
				System.out.println("O vencedor eh " + candidato.getNome() + " com " + candidato.getCandidato() + " votos ");
			}
		}
	}
	
	private static Candidatos parseCandidatosNome(String nome){
		Candidatos candidato = new Candidatos();
		candidato.setNome(nome);
		return candidato;
	}
}
