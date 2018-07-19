package aula2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu salário liquido. 
//Receba o valor do salário bruto, o valor dos descontos e o valor do possível empréstimo de um cliente, 
//em seguida avise se ele poderá ou não fazer o empréstimo.
public class Exercicio1 {	
	public Exercicio1(){}
	public static void main(String[] args) {
		Scanner inputSalario = new Scanner(System.in);
		Scanner inputDescontos = new Scanner(System.in);
		Scanner inputEmprestimo = new Scanner(System.in);
		Exercicio1 exer1   = new Exercicio1();
		
		BigDecimal vlSalario   	= exer1.getSalario(inputSalario);
		BigDecimal vlDesconto	= exer1.getDesconto(inputDescontos);
		BigDecimal vlEmprestimo	= exer1.getEmprestimo(inputEmprestimo);
		
		// Calculos para Conceção
		boolean respostaEmprestimo	= exer1.getRespostaCalculo(vlSalario, vlDesconto, vlEmprestimo);
		
		if(respostaEmprestimo){
			System.out.println("Emprestimo Concedido.");
		}else{
			System.out.println("Não atingiu a meta de 30% do salário líquido para o emprestimo.");
		}
		
		inputSalario.close();
		inputDescontos.close();
		inputEmprestimo.close();
	}
		
	private BigDecimal getSalario(Scanner inputSalario) {
		BigDecimal vlSal = new BigDecimal("0");
		System.out.print("Entre com valor do salário:");
		try {
			vlSal = inputSalario.nextBigDecimal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vlSal;
	}
	
	private BigDecimal getDesconto(Scanner inputDescontos) {
		BigDecimal vlDescontos = new BigDecimal("0");
		System.out.print("Entre com valor de desconto:");
		try {
			vlDescontos = inputDescontos.nextBigDecimal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vlDescontos;
	}
	
	private BigDecimal getEmprestimo(Scanner inputEmprestimo) {
		BigDecimal vlEmprestimo = new BigDecimal("0");
		System.out.print("Entre com valor do empréstimo:");
		try {
			vlEmprestimo = inputEmprestimo.nextBigDecimal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vlEmprestimo;
	}
	
	private boolean getRespostaCalculo(BigDecimal vlSalario, BigDecimal vlDesconto, BigDecimal vlEmprestimo) {
		boolean returnEmprestimo = false;
		
		BigDecimal valorLiquido = vlSalario.subtract(vlDesconto);
		
		if((vlEmprestimo.divide(valorLiquido, RoundingMode.HALF_EVEN)).multiply(new BigDecimal("100")).longValue() <= 30){
			returnEmprestimo = true;
		}
		
		return returnEmprestimo;
	}
}
