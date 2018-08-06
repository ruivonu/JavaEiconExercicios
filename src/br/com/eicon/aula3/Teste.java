package br.com.eicon.aula3;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o mes: ");
		String nome = sc.nextLine().toLowerCase();
		
		for (int i = 1; i <= 12; i++) {
			
			LocalDate plusMonths = LocalDate.now().plusMonths(i);
		
			if(plusMonths.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt")).toLowerCase().equals(nome)){
				 System.out.println(plusMonths.getMonth().getValue());
			}
			
		}
		
		sc.close();
       
	}

}
