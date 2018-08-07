package br.com.eicon.aula7;

public class Canidae extends Carnivora {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Canidae";
	}
}
