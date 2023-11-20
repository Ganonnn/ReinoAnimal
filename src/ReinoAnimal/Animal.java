package ReinoAnimal;

public class Animal {
	
    //Atributos de animal
	public String especie;
	public String sexo;
	public String dataDeNascimento;
	
	//atributo para contar o numero de animais
	private static int contador;
    
	//metodo que imprime que o animal esta comendo
	public void comer() {
		System.out.println("O animal está comendo...");
	}
    
	//imprimi os atributos do animal
	public void perfil() {
		System.out.println("Especie: " + getEspecie());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Data de nascimento: " + getDataDeNascimento());
	}
    
	//abaixo temos os metodos get e set
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Animal.contador = contador;
	}
    
	//Construtor para botar valor nos atributos
	public Animal(String especie, String sexo, String dataDeNascimento, int contador) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.contador = contador;
		setContador(contador + 1);
	}
}
