package br.com.eicon.aula7;

public class Diptera extends Insecta{
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Diptera";
	}
}