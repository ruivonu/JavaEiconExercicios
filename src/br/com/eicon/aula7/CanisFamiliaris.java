package br.com.eicon.aula7;

public class CanisFamiliaris extends Canis {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Canis Familiaris";
	}
}