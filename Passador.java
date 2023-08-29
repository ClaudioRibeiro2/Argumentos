public class Passador { // {} -> Bloco
	// Atributos:
	private int umNumero;
	
	// Construtor:
	public Passador(int umNumero){
		this.umNumero =umNumero;
	}
	
	// Set & Getter
	public void setUmNumero(int umNumero){ // Void não tem return
		this.umNumero = umNumero;
	}
	
	public int getUmNumero(){
		return this.umNumero;
	}
}// Fim da classe passador