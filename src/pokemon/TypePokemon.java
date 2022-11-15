package pokemon;

public enum TypePokemon {
	Feu,Plante,Eau;
	
	public String afficherType(TypePokemon type)
	{
		return "Je suis de type "+type;
	}

}
