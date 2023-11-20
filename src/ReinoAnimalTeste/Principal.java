package ReinoAnimalTeste;

import ReinoAnimal.Terrestre;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Aereo;

public class Principal {

	public static void main(String[] args) {
		Terrestre felisCatus = new Terrestre("Felis Catus", "fêmea", "2", "Asia", true);
		Terrestre HydrochoerusHydrochaeris = new Terrestre("Hydrochoerus Hydrochaeris", "macho", "8", "America do sul", true);
		
		Aquatico carchariasTaurus = new Aquatico("Carcharias Taurus", "fêmea", "7", "agua salgada", false);
		Aquatico pygocentrusNattereri = new Aquatico("Pygocentrus Nattereri", "macho", "3", "agua doce", true);
		
		Aereo coragypsAtratus = new Aereo("Coragyps Atratus", "macho", "3", 54.5);
		Aereo amazonaAestiva = new Aereo("Amazona Aestiva", "fêmea", "10", 37.9);
		
		System.out.println("Quantidade de animais adicionados: " + felisCatus.getContador());
	}

}

