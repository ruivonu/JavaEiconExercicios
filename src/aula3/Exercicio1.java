package aula3;

import java.text.DecimalFormat;
import java.util.Scanner;

//Crie um programa para simular uma urna de votação para exatamente 3 candidatos.  
//Logo no início deve-se perguntar ao usuário os nomes dos candidatos. Permita votos em branco. 
//Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de cada candidato. 
//Apresente também a quantidade e o percentual dos votos em branco e quem foi o ganhador da eleição.
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int qtdVotos 			= 0;
		int votoApurado 		= 0;
		double branco 			= 0;
		double canndidatoCod1 	= 0;
		double canndidatoCod2 	= 0;
		double canndidatoCod3 	= 0;
		String resultado 		= null;
		
		qtdVotos = getQtdVotos(input);
		
		System.out.println("Os candidatos são: Eicon, Alura e Java");
		
		for (int i = 1; i <= qtdVotos; i++){
			votoApurado = getCodCandidato(input, i);
			switch (votoApurado) {
				case 0 :  branco++;
							break;
				case 1 :  canndidatoCod1++;
							break;
				case 2 :  canndidatoCod2++;
							break;
				case 3 :  canndidatoCod3++;
							break;
			}
		}
		
		if(((canndidatoCod1 > canndidatoCod2) && (canndidatoCod1 > canndidatoCod3))){
			resultado = "EICON com " + canndidatoCod1 + " Votos";
		}else if(((canndidatoCod2 > canndidatoCod1) && (canndidatoCod2 > canndidatoCod3))){
			resultado = "ALURA com " + canndidatoCod2 + " Votos";
		}else if(((canndidatoCod3 > canndidatoCod2) && (canndidatoCod3 > canndidatoCod1))){
			resultado = "JAVA com " + canndidatoCod3 + " Votos";
		}
		
		System.out.println("O candidato eleito foi: " + resultado);
		System.out.println("Porcentagem de votos dos candidatos:");
		System.out.println("Eicon: " + df.format((canndidatoCod1 / qtdVotos) * 100) + "%");
		System.out.println("Alura: " + df.format((canndidatoCod2 / qtdVotos) * 100) + "%");
		System.out.println("Java : " + df.format((canndidatoCod3 / qtdVotos) * 100) + "%");
		System.out.println("Brancos : " + df.format((branco / qtdVotos) * 100) + "%");
		
	}

	private static int getQtdVotos(Scanner input) {
		int retQtdVotos = 0;
		System.out.print("Entre com a quantidade de votos:");
		try {
			retQtdVotos = input.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retQtdVotos;
	}
	
	private static int getCodCandidato(Scanner input, int j) {
		String nmCandidto  = null;
		int retCodCandidto = 0;
		System.out.println("Voto " + j + ". Entre com o candidato desejado:");
		try {
			nmCandidto = input.nextLine();
			switch (nmCandidto.toUpperCase()) {
				case "EICON" :  retCodCandidto = 1 ;
								break;
				case "ALURA" :  retCodCandidto = 2 ;
								break;
				case "JAVA"  :  retCodCandidto = 3 ;
								break;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retCodCandidto;
	}
}