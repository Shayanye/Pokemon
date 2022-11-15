package pokemon.speciaux;

import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonPlante extends Pokemon {
	
	public PokemonPlante(String nom)
	{
		super(nom,TypePokemon.Plante);
	}

	public void attaquer(Pokemon p)
	{
	 log("J'attaque "+p.getNom()+" : "+getType()+" vs "+p.getType());
	 subir(p);
	}
	
	public void subir(Pokemon p)
	{
		{
			switch(p.getType())
			{
			case Eau:
				log("C'est très efficace !");
				hp=hp-p.getAttaque()/2;
				break;
			case Plante:
				hp=hp-p.getAttaque();
				break;
			case Feu:
				log("C'est peu efficace...");
				hp=hp-p.getAttaque()*2;
				break;
				
			}
		}
	}

}
