package br.com.eicon.aula1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exercicio1 {
	public exercicio1(){}
	  
	public static void main(String args[]) {
		Scanner inputNasci = new Scanner(System.in);
		Scanner inputAtual = new Scanner(System.in);
		exercicio1 exer1   = new exercicio1();
		
		int retIdade;
		Date idadeNascimento   = exer1.getIdadeNasci(inputNasci);
		Date idadeAtual		   = exer1.getIdadeAtual(inputAtual);
		
		retIdade = getIdade(idadeNascimento,idadeAtual);
		
		String str = "Sua idade eh: " + retIdade;
		System.out.print(str);
		
		inputNasci.close();
		inputAtual.close();
    }
	
	private Date getIdadeNasci(Scanner inputNasci) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String idadeNasci = null;
		Date dtn = null;
		
		System.out.print("Entre com a data de nascimento:");
		idadeNasci = inputNasci.nextLine();
	
		try {
			Date idn = sdf.parse(idadeNasci);
			dtn = idn;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dtn;
	}
	
	private Date getIdadeAtual(Scanner inputAtual) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String idadeAtual = null;
		Date dta = null;
		
		System.out.print("Entre com a data atual:");
		idadeAtual = inputAtual.nextLine();
		
		try {
			Date ida = sdf.parse(idadeAtual);
			dta = ida;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dta;
	}
	
	public static int getIdade(java.util.Date dtN, java.util.Date dtA) {
	    Calendar dtNasc = Calendar.getInstance();  
	    dtNasc.setTime(dtN); 
	    Calendar dtAtua = Calendar.getInstance();  
	    dtAtua.setTime(dtA);  
	    int idade = 0;
	    
	    try {
		    idade = dtAtua.get(Calendar.YEAR) - dtNasc.get(Calendar.YEAR);
		    
		    if (dtAtua.get(Calendar.MONTH) < dtNasc.get(Calendar.MONTH)) {
		      idade--;  
		    }else{ 
		        if (dtAtua.get(Calendar.MONTH) == dtNasc.get(Calendar.MONTH) && dtAtua.get(Calendar.DAY_OF_MONTH) < dtNasc.get(Calendar.DAY_OF_MONTH)) {
		            idade--; 
		        }
		    }
	    } catch (Exception e) {
			e.printStackTrace();
		}
	    
	    return idade;
	}
}
