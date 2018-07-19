package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Solicite a quantidade de homens e de mulheres de uma turma de um curso de Java. 
//Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.
public class exercicio3 {
	public exercicio3(){}

	public static void main(String args[]) {
		Scanner inputQtdH = new Scanner(System.in);
		Scanner inputQtdM = new Scanner(System.in);
		DecimalFormat df  = new DecimalFormat("#.00");
		exercicio3 exer3  = new exercicio3();
		
		double retPercentH = 0.0;
		double retPercentM = 0.0;
		int homensQtd  	= exer3.getQtdHomem(inputQtdH);
		int mulheresQtd = exer3.getQtdMulher(inputQtdM);
		double totParticipantes = homensQtd + mulheresQtd; 
		
		retPercentH = (homensQtd / totParticipantes)*100;
		retPercentM	= (mulheresQtd / totParticipantes)*100;
		
		String str = "A porcentagem de homens no curso eh: " + df.format(retPercentH) + "% e a porcentagem de mulheres eh: " + df.format(retPercentM) + "%";
		System.out.print(str);
		
		inputQtdH.close();
		inputQtdM.close();
	}
	
	private int getQtdHomem(Scanner inputQtdH) {
		int qtdHomem = 0;
		
		System.out.print("Entre com o número de homens:");
		qtdHomem = inputQtdH.nextInt();
		
		return qtdHomem;
	}
	
	private int getQtdMulher(Scanner inputQtdM) {
		int qtdMulher = 0;
		
		System.out.print("Entre com o número de mulheres:");
		qtdMulher = inputQtdM.nextInt();
		
		return qtdMulher;
	}
	
}