package pokemon.speciaux;

import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonEau extends Pokemon{

	public PokemonEau(String nom)
	{
		super(nom,TypePokemon.Eau);
	}

	public void attaquer(Pokemon p)
	{
	log("J'attaque "+p.getNom()+" : "+getType()+" vs "+p.getType());
	subir(p);
	}
	
	public void subir(Pokemon p)
	{
		switch(p.getType())
		{
		case Eau:
			hp=hp-p.getAttaque();
			break;
		case Plante:
			log("C'est peu efficace...");
			hp=hp-p.getAttaque()*2;
			break;
		case Feu:
			log("C'est très efficace !");
			hp=hp-p.getAttaque()/2;
			break;
			
		}
	}
}
