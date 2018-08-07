package br.com.eicon.aula7;

public class MuscaDomestica extends Musca {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Musca Domestica";
	}
}
