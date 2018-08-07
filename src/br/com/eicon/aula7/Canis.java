package br.com.eicon.aula7;

public class Canis extends Canidae {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Canis";
	}
}
