package br.com.eicon.aula7;

public class Chordata extends Animalia {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Chordata";
	}
}
