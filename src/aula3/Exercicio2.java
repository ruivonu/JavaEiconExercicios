package aula3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;

//1. Apresente uma tabela contendo a evolução do valor de uma dívida ao longo dos meses e anos a partir de janeiro de 2007.
//   Solicite o valor da dívida, a taxa de correção  e a quantidade de anos.               
//   Por exemplo, para uma dívida de R$ 100,00 ao longo de 2 anos e com uma taxa de correção de 1.8 % ao mês:
//2. Anos    Jan    Fev    Mar     Abr     Mai     Jun     Jul     Ago     Set     Out     Nov     Dez
//   2007    100    101,8  103,63  105,5   107,4   109,33  111,3   113,3   115,34  117,42  119,53  121,68
//   2008    123,87 126,1  128,37  130,68  133,03  135,43  137,87  140,35  142,87  145,45  148,06  150,73
public class Exercicio2 {
	public static void main(String[] args) throws ParseException {
		//SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		BigDecimal valorDivida = new BigDecimal(100.0);
		BigDecimal valorCorrecao = new BigDecimal(1.8);
		System.out.println("Anos - Jan    - Fev    - Mar    - Abr    - Mai    - Jun    - Jul    - Ago    - Set    - Out    - Nov    - Dez");
		for(int i = 2007; i <= 2018; i++){
			System.out.print(i + " - ");
			for(int j = 1; j <= 12; j++){
				//String nmStringMes = Integer.toString(j);
				/*System.out.print(sdf.parse(String.valueOf(j)) + " "j + " - ");*/
			}
			for(int j = 1; j <= 12; j++){
				valorDivida = ((valorDivida.multiply(valorCorrecao.setScale(2, RoundingMode.HALF_EVEN))).divide(new BigDecimal("100")).add(valorDivida)).setScale(2, RoundingMode.HALF_EVEN);
				System.out.print(valorDivida + " - ");
			}
			System.out.println("");
		}
	}
}