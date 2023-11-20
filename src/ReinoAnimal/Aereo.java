package ReinoAnimal;
public class Aereo extends Animal{
    
	//atributo de animal aereo
	double altitudePossivel;
	
	//metodo que imprime que o animal está nadando
	public void voar() {
		System.out.println("“O animal está voando...");
	}

	//metodo que imprime que o animal esta comendo
	public void comer() {
		System.out.println("O animal aereo esta comendo...");;
	}
	
	//metodo que imprime os atributos do animal aereo
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDataDeNascimento());
		System.out.println("Altitude maxima: " + getAltitudePossivel());
	}
	
	//construtor pra dar o valor do atributo do animal aereo
	public Aereo(String especie, String sexo, String dtNascimento, double altitudePossivel) {
		super(especie, sexo, dtNascimento, getContador());
		this.altitudePossivel = altitudePossivel;
	}
	
	//metedo get e set do animal
	public double getAltitudePossivel() {
		return altitudePossivel;
	}

	public void setAltitudePossivel(double altitudePossivel) {
		this.altitudePossivel = altitudePossivel;
	}
	
}
