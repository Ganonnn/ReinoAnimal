package ReinoAnimal;

public class Aquatico extends Animal {
    
    //atributos exclusivos dos animais aquaticos
	String tipoAgua;
	boolean possuiEscama;
    
	//metodo que imprime que o animal está nadando
	public void nadar() {
		System.out.println("O animal está nadando...");
	}
    
	//metodo que imprime que o animal esta comendo
	public void comer() {
		System.out.println("O aquatico esta comendo...");
		;
	}
    
	//metodo que imprime os atributos do animal aquatico
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDataDeNascimento());
		System.out.println("Tipo da agua do seu habitat: " + getTipoAgua());
		System.out.println("Possui escama: " + isPossuiEscama());
	}
    
	//construtor pra dar o valor do atributo do animal terrestre
	public Aquatico(String especie, String sexo, String dtNascimento, String tipoAgua, boolean possuiEscama) {
		super(especie, sexo, dtNascimento, getContador());
		this.tipoAgua = tipoAgua;
		this.possuiEscama = possuiEscama;
	}
    
	//metodos get e set
	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isPossuiEscama() {
		return possuiEscama;
	}

	public void setPossuiEscama(boolean possuiEscama) {
		this.possuiEscama = possuiEscama;
	}
}
