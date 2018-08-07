package br.com.eicon.aula7;

public class HomoSapiens extends Homo {
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());
		return "Homo Sapiens";
	}
}
