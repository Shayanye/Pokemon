package pokemon;
import pokemon.speciaux.*;
import dresseur.Dresseur;
public class test {

	private static void TestPokemon0() {
		System.out.println("Test pokémon");
		Pokemon0 p1=new Pokemon0("Patapon");
		Pokemon0 p2=new Pokemon0("Blazigar");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());	
	}
	
	private static void TestPokemonType() {
		PokemonEau eau=new PokemonEau("Tiplouf");
		PokemonFeu feu=new PokemonFeu("Salamèche");
		eau.log(eau.toString());
		feu.log(feu.toString());
		eau.attaquer(feu);
		feu.attaquer(eau);
		eau.log(eau.toString());
		feu.log(feu.toString());
	}
	public static void main(String[] args) {
		
		Dresseur sacha=new Dresseur("Sacha",200);
		Dresseur pierre=new Dresseur("Piere",200);
		sacha.log(sacha.toString());
		sacha.capturerPokemon();
		sacha.log(sacha.toString());
		
		pierre.log(pierre.toString());
		pierre.capturerPokemon();
		pierre.log(pierre.toString());
		
		sacha.combattre(pierre);
		sacha.log(sacha.toString());
		pierre.log(pierre.toString());
		
	}

}
