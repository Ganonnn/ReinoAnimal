package ReinoAnimal;

public class Aquatico extends Animal {
    
    //atributos exclusivos dos animais aquaticos
	String tipoAgua;
	boolean possuiEscama;

	public void nadar() {
		System.out.println("O animal está nadando...");
	}
    
	//metodo que imprimi que o animal esta comendo
	public void comendo() {
		System.out.println("O aquatico esta comendo...");
		;
	}

	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDataDeNascimento());
		System.out.println("Tipo da agua do seu habitat: " + getTipoAgua());
		System.out.println("Possui escama: " + isPossuiEscama());
	}

	public Aquatico(String especie, String sexo, String dtNascimento, String tipoAgua, boolean possuiEscama) {
		super(especie, sexo, dtNascimento, getContador());
		this.tipoAgua = tipoAgua;
		this.possuiEscama = possuiEscama;
	}

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
