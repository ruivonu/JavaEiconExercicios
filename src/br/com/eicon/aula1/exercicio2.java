package br.com.eicon.aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

//Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.  
//Para isto, peça o valor do seu salário e o valor do salário mínimo atual.
public class exercicio2 {
	public exercicio2(){}

	public static void main(String args[]) {
		Scanner inputSalFunc = new Scanner(System.in);
		Scanner inputSalMin  = new Scanner(System.in);
		DecimalFormat df 	 = new DecimalFormat("#.00");
		exercicio2 exer2 	 = new exercicio2();
		
		double retQtdSalMin;
		double salarioFun   = exer2.getSalario(inputSalFunc);
		double salarioMin   = exer2.getSalarioMinimo(inputSalMin);
		
		retQtdSalMin = getQdtSalMin(salarioFun,salarioMin);
		
		String str = "A quantidade de salário minimo eh: " + df.format(retQtdSalMin);
		System.out.print(str);
		
		inputSalFunc.close();
		inputSalMin.close();
	}
	
	private double getSalario(Scanner inputSalFunc) {
		double salarioF = 0.0;
		
		System.out.print("Entre com o salário Funcionario:");
		salarioF = inputSalFunc.nextDouble();
		
		return salarioF;
	}
	
	private double getSalarioMinimo(Scanner inputSalMin) {
		double salarioM = 0.0;
		
		System.out.print("Entre com o salário Minimo:");
		salarioM = inputSalMin.nextDouble();
		
		return salarioM;
	}
	
	public static double getQdtSalMin(double salarioFun, double salarioMin) {
	    double retQtdSalMin = 0;
	    
	    try {
	    	retQtdSalMin = salarioFun / salarioMin;
	    } catch (Exception e) {
			e.printStackTrace();
		}
	    
	    return retQtdSalMin;
	}
}