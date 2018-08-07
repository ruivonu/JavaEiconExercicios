package br.com.eicon.aula7;

public class Carnivora extends Mammalia {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Carnivora";
	}
}