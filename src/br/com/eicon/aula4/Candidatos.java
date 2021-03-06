package br.com.eicon.aula4;

public class Candidatos {
	private String nome;
	private double votosCandidato;
	private int id;
    
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setCandidato() {
		this.votosCandidato = this.votosCandidato++;
	}
	
	public double getCandidato() {
		return this.votosCandidato;
	}
	
	public String retornaCandidatos(String candidato1, String candidato2, String candidato3) {
		return " 1 para candidato " + candidato1 + "\n" +
			   " 2 para candidato " + candidato2 + "\n" + 
			   " 3 para candidato " + candidato3 + "\n";
	}
	
	public double getPercentualVotos(double totalVotos) {
		return (this.getCandidato() / totalVotos) * 100;
	}
}
