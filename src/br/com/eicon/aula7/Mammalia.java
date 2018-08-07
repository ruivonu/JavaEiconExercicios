package br.com.eicon.aula7;

public class Mammalia extends Chordata{
	@Override
	protected String getDescricao() {
		System.out.println(super.getDescricao());	
		return "Mammalia";
	}
}
