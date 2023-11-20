package ReinoAnimal;

public class Terrestre extends Animal{
	
	//atributos exclusivo do animal terrestre
	String regiao; 
	boolean possuiPelo; 
	
	//metodo que imprimi que o animal esta comendo
	public void comer() {
		System.out.println("O animal terrestre esta comendo...");;
	}
	
	//construtor pra dar o valor do atributo do animal terrestre
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDataDeNascimento());
		System.out.println("Região onde vive: " + getRegiao());
		System.out.println("Possui pelo: " + isPossuiPelo());
	}
	
	//construtor pra dar o valor do atributo do animal aquatico
	public Terrestre(String especie, String sexo, String dtNascimento, String regiao,
			boolean possuiPelo) {
		super(especie, sexo, dtNascimento, getContador());
		this.regiao = regiao;
		this.possuiPelo = possuiPelo;
	}
    
	//metodos get e set
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPossuiPelo() {
		return possuiPelo;
	}

	public void setPossuiPelo(boolean possuiPelo) {
		this.possuiPelo = possuiPelo;
	}
	
}
