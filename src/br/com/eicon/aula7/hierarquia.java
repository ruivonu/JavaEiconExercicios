package br.com.eicon.aula7;

import java.util.Scanner;

public class hierarquia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite HOMEM, C�O ou MOSCA:");
		String entrada = sc.nextLine().toLowerCase();
		
		switch (entrada) {
	        case "homem":
	        	Animalia busca = new HomoSapiens();
	    		System.out.println(busca.getDescricao());
	            break;
	        case "c�o":
	        	Animalia busca1 = new CanisFamiliaris();
	    		System.out.println(busca1.getDescricao());
	            break;
	        case "mosca":
	        	Animalia busca2 = new MuscaDomestica();
	    		System.out.println(busca2.getDescricao());
	            break;
	        default:
	             System.out.println("Este n�o eh uma entrada v�lida!");
		}
		sc.close();
	}
}
