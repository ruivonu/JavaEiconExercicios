package br.com.eicon.aula7;

public class Primata extends Mammalia {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Primata";
	}
}
