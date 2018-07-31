package aula4_old;

public class Candidatos {
	private String nomeCandidato;
	private int votosCandidatos;
	
	public Candidatos(String nomeCandidato, int votosCandidatos) {
        this.nomeCandidato = nomeCandidato;
        this.votosCandidatos = votosCandidatos;
    }
	
	public void setCandidato(String nomeCandidato){
		this.nomeCandidato = nomeCandidato;
	}
	
	public void setVotoCandidato(){
		this.votosCandidatos++;
	}
	
	public String getNomeCandidato(){
		return this.nomeCandidato;
	}
	
	public int getVotosCandidato(){
		return this.votosCandidatos;
	}
}
