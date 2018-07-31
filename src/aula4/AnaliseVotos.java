package aula4;

public class AnaliseVotos {
	static double temp = 0;
	static int eleito = 0;
	
	public static void verificaVencedorNovo(double voto,int id){
		if(temp < voto){
			temp = voto;
			eleito = id;
		}	
	}
	
	public static int getVencendor(){
		return eleito;
	}
}
