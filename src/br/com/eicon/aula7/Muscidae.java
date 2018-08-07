package br.com.eicon.aula7;

public class Muscidae extends Diptera {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Muscidae";
	}
}
