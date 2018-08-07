package br.com.eicon.aula7;

import java.util.Scanner;

public class hierarquia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite HOMEM, CÃO ou MOSCA:");
		String entrada = sc.nextLine().toLowerCase();
		
		switch (entrada) {
	        case "homem":
	        	Animalia busca = new HomoSapiens();
	    		System.out.println(busca.getDescricao());
	            break;
	        case "cão":
	        	Animalia busca1 = new CanisFamiliaris();
	    		System.out.println(busca1.getDescricao());
	            break;
	        case "mosca":
	        	Animalia busca2 = new MuscaDomestica();
	    		System.out.println(busca2.getDescricao());
	            break;
	        default:
	             System.out.println("Este não eh uma entrada válida!");
		}
		sc.close();
	}
}
