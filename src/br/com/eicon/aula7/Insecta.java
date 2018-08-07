package br.com.eicon.aula7;

public class Insecta extends Arthropoda{
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Insecta";
	}
}
