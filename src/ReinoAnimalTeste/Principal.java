package ReinoAnimalTeste;

import ReinoAnimal.Terrestre;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Aereo;

public class Principal {

	public static void main(String[] args) {
		
		//criando animais do tipo terrestre
		Terrestre felisCatus = new Terrestre("Felis Catus", "fêmea", "2", "Asia", true);
		Terrestre HydrochoerusHydrochaeris = new Terrestre("Hydrochoerus Hydrochaeris", "macho", "8", "America do sul", true);
		
		//criando animais do tipo aquatico
		Aquatico carchariasTaurus = new Aquatico("Carcharias Taurus", "fêmea", "7", "agua salgada", false);
		Aquatico pygocentrusNattereri = new Aquatico("Pygocentrus Nattereri", "macho", "3", "agua doce", true);
		
		//criando animais do tipo aereo
		Aereo coragypsAtratus = new Aereo("Coragyps Atratus", "macho", "3", 54.5);
		Aereo amazonaAestiva = new Aereo("Amazona Aestiva", "fêmea", "10", 37.9);
		
		//imprimindo a contagem de animais a partir do atributo do primeiro animal criado 
		System.out.println("Quantidade de animais adicionados: " + felisCatus.getContador());
	}

}

