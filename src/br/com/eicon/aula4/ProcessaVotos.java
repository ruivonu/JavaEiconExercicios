package br.com.eicon.aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaVotos {
	public static void processaVotos(ArrayList<Candidatos> array){
		Scanner input = new Scanner(System.in);
		Candidatos branco = new Candidatos();
		double totalVotos = 0;
		double votosEmBranco = 0;
		
		for(int y = 0; y < 2; y++) {
			String retornaCandidato = "";
			for (Candidatos candidato : array) {			
				retornaCandidato += (array.indexOf(candidato)+1) + " - " + candidato.getNome() + " \n";
			}
			retornaCandidato += "999 - para encerrar a votação.\n";
			System.out.println(retornaCandidato);
			int escolhaDeVoto = 0;
			try{
				escolhaDeVoto = input.nextInt();
			}catch (Exception e){
				System.out.println("Deve ser inserido código do candidatos e não o nome!");
				return;		
			}
	    	totalVotos = totalVotos + 1;
	    	if(escolhaDeVoto <= array.size()){
		    	if(array.get((escolhaDeVoto-1)) != null){
		    		for (Candidatos candidato : array) {			
		    			if(candidato.getId() == escolhaDeVoto){
		    				candidato.setCandidato();
		    				candidato.getPercentualVotos(totalVotos);	
		    				AnaliseVotos.verificaVencedorNovo(candidato.getCandidato(), candidato.getId());
		    				System.out.println("O candidato " + candidato.getNome() + " recebeu " + candidato.getCandidato() + " voto(s) e seu percentual eh: " + candidato.getPercentualVotos(totalVotos) + " %\n");
		    			}
		    		}
		    	}
	    	}else{
	    		if(escolhaDeVoto == 999){
		    		y = 3;
		    	}else{
		    		votosEmBranco = votosEmBranco + 1;
		    		branco.setCandidato();
		    		AnaliseVotos.verificaVencedorNovo(votosEmBranco, escolhaDeVoto);
		    		System.out.println("Total de voto(s) em Branco eh: " + votosEmBranco + " o percentual eh: " + branco.getPercentualVotos(totalVotos) + " %\n");
		    	}
	    	}
	    	y--;
		}
		input.close();
	}
}
