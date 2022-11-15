package dresseur;
import pokemon.Pokemon;


public class Dresseur {
	private SacAdos sac;
	private String nom;
	private int argent;
	
	public Dresseur(String nom, int argent) {
		this.nom=nom;
		this.argent=argent;
		this.sac=new SacAdos(this);
	}

	public String getNom()
	{
		return nom;
	}
	
	public int getNbPokemon()
	{
		return sac.getNbPokemon();
	}
	
	public void capturerPokemon()
	{
		sac.capturerPokemon();
	}
	
	private String prefixe()
	{
		return ("[Dresseur "+nom+"]");
	}
	
	public void log(String msg)
	{
		System.out.println(prefixe()+msg);
	}

	
	public String toString()
	{
		return ("Je m'appelle "+getNom()+"\n J'ai "+getNbPokemon()+" Pokemons"+"\n J'appartiens à l'équipe sagesse "
				+ "\n je possède "+argent+" Pokédollars\n");
	}
	
	public boolean peutCombattre()
	{
		if( sac.peutCombattre() && argent>=10)
		{
			return true;
		}else {
			return false;
		}
	}
	
	public void prendreArgent(Dresseur adversaire)
	{
		argent=argent+10;
		adversaire.argent=adversaire.argent-10;
	}
	
	
	public Pokemon getNextPokemon()
	{
		return sac.getNextPokemon();
	}
	
// PB là aussi.	
	public void combattre(Dresseur adversaire)
	{
		Pokemon pokemon_adversaire=adversaire.getNextPokemon();
		Pokemon pokemon_dresseur=getNextPokemon();
		log("Je suis "+getNom()+" et je te défie "+adversaire.getNom()+"!");
		while (peutCombattre() && adversaire.peutCombattre())
		{
			while(!(pokemon_dresseur.isKO()) && !(pokemon_adversaire.isKO()))
			{
			 pokemon_dresseur.attaquer(pokemon_adversaire);
			 pokemon_adversaire.attaquer(pokemon_dresseur);
			
			}
			if(pokemon_dresseur.isKO()) {
				pokemon_dresseur=getNextPokemon();
			} else if(pokemon_adversaire.isKO()) {
				pokemon_adversaire=adversaire.getNextPokemon();
			}
		}
		if(peutCombattre())
		{
			log(getNom()+" Est le gagnant :");
			prendreArgent(adversaire);
		} else if(adversaire.peutCombattre()){
			adversaire.log(adversaire.getNom()+" Est le gagnant !");
			adversaire.prendreArgent(this);
		}
	}
	
	public void pokeCenter()
	{
		this.log("Vous partez soigner vos pokemons !");
		sac.pokeCenter();
		this.log("Tous vos pokémons sont soignés");
	}
	
}
