package dresseur;

import pokemon.*;
import pokemon.speciaux.*;
import java.util.Random;
import java.util.ArrayList;

public class SacAdos {
	private Random random=new Random();
	private Dresseur dresseur;
	ArrayList<Pokemon> equipe_pokemon=new ArrayList<Pokemon>(3);
	
	public SacAdos(Dresseur dresseur)
	{
	 this.dresseur=dresseur;	
	}
	
	public int getNbPokemon()
	{
		return equipe_pokemon.size();
	}
	
	private TypePokemon donnerType()
	
	{   int choixtype=random.nextInt(3);
	
		switch(choixtype)
		{
		case 0:
			return TypePokemon.Eau;
		case 1:
			return TypePokemon.Feu;
		case 2:
			return TypePokemon.Plante;
		default:
			return TypePokemon.Eau;
		}
	}
	public void capturerPokemon()
	{
		int valeur=random.nextInt(3);
		for(int i=0;i<=valeur;i++)
		{
			dresseur.log("Capture du Pokémon !");
			switch(donnerType())
			{
			case Eau:
				equipe_pokemon.add(new PokemonEau(dresseur.getNom()+": Pokemon"+(i+1)));
				equipe_pokemon.get(i).log(equipe_pokemon.get(i).toString());
				break;
			case Feu:
				equipe_pokemon.add(new PokemonFeu(dresseur.getNom()+"Pokemon"+(i+1)));
				equipe_pokemon.get(i).log(equipe_pokemon.get(i).toString());
				break;
			case Plante:
				equipe_pokemon.add(new PokemonPlante(dresseur.getNom()+"Pokemon"+(i+1)));
				equipe_pokemon.get(i).log(equipe_pokemon.get(i).toString());
				break;
			}
			
		}
	}
	
	public boolean peutCombattre()
	{
		for(int i=0; i<equipe_pokemon.size(); i++)
		{
			if(!equipe_pokemon.get(i).isKO())
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void tour_de_combat(Pokemon pokemon_adversaire)
	{
	 Pokemon pokemon_dresseur=equipe_pokemon.get(0);
	
	}
	
	
	//C'est caca j'ai besoin d'aide
	public Pokemon getNextPokemon()
	{   
		for(int i=0; i<equipe_pokemon.size(); i++)
		{
			if(!equipe_pokemon.get(i).isKO())
			{
				
				return equipe_pokemon.get(i);
			}
			
		}
		return null;
	}
	
	public void pokeCenter()
	{
		for(int i=0; i<equipe_pokemon.size(); i++)
		{
			equipe_pokemon.get(i).soigner();
		}
		
	}
}
