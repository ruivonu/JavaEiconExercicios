package br.com.eicon.aula7;

public class Hominidae extends Primata {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Hominidae";
	}
}