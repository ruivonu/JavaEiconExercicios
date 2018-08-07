package br.com.eicon.aula7;

public class Arthropoda extends Animalia {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Arthropoda";
	}
}
