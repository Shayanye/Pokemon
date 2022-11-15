package pokemon.speciaux;
import pokemon.*;


public class PokemonFeu extends Pokemon{
	
	public PokemonFeu(String nom)
	{
		super(nom,TypePokemon.Feu);
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
				log("C'est peu efficace ...");
				hp=hp-p.getAttaque()*2;
				break;
			case Plante:
				log("C'est très efficace !");
				hp=hp-p.getAttaque()/2;
				break;
			case Feu:
				hp=hp-p.getAttaque();
				break;
				
			}
		}
	}
}
