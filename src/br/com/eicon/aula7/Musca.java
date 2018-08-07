package br.com.eicon.aula7;

public class Musca extends Muscidae{
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Musca";
	}
}
