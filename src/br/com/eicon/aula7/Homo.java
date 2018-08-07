package br.com.eicon.aula7;

public class Homo extends Hominidae{
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Homo";
	}
}