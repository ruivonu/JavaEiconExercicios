package br.com.eicon.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Receba do usuário o nome de um mês. Exiba o número equivalente.
public class Exercicio3 {
	public Exercicio3(){}
	public static void main(String[] args) {
		Scanner inputMes = new Scanner(System.in);
		Exercicio3 exer3   = new Exercicio3();
		
		String mesStr = exer3.getMesString(inputMes).toUpperCase();
		int returnMes = exer3.getMesInteiro(mesStr);
		
		if(returnMes == 0){
			System.out.println("O mês de '" + mesStr + "' referencia não encontrada.");
		}else{
			System.out.println("O mês de '" + mesStr + "' refere-se ao mês numeral: " + returnMes);
		}
		
		inputMes.close();
	}
	
	private String getMesString(Scanner inputMes) {
		String mesString = null;
		
		System.out.print("Entre com nome do mês: ");
		
		try {
			mesString = inputMes.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mesString;
	}
	
	private int getMesInteiro(String mesStr) { 
		List<String> mesesString = new ArrayList<String>();
		
		int retornoMes = 0;
		
		mesesString.add("JANEIRO");
		mesesString.add("FEVEREIRO");
		mesesString.add("MARÇO");
		mesesString.add("ABRIL");
		mesesString.add("MAIO");
		mesesString.add("JUNHO");
		mesesString.add("JULHO");
		mesesString.add("AGOSTO");
		mesesString.add("SETEMBRO");
		mesesString.add("OUTUBRO");
		mesesString.add("NOVEMBRO");
		mesesString.add("DEZEMBRO");
		
		for (int i = 0; i < mesesString.size(); i++) {
	        if (mesesString.get(i).contains(mesStr.trim())) {
	        	retornoMes = i + 1;
	        }
	    }
		 
		return retornoMes;
	}
	
}
