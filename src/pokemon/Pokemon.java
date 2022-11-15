package pokemon;
import java.util.Random;

public abstract class Pokemon {
	private TypePokemon Type;
	private String nom;
	private int attaque;
	protected int hp;
	private int niveau;
	private static java.util.Random random=new Random();
	private int valeur=random.nextInt(11);
	
	public Pokemon(String nom, TypePokemon type) {
		this.nom=nom;
		if(valeur==0) {
			this.niveau=1;
		}else {
		this.niveau=valeur;}
		
		this.hp=niveau*2;
		this.attaque=(niveau/2)+1;
		this.Type=type;
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	
	public TypePokemon getType()
	{
		return Type;
	}
	/**
	 * @return the attaque
	 */
	public int getAttaque() {
		return attaque;
	}
	
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}

	
	public  boolean isKO()
	{
		if(hp<=0)
		{
			return true;
		}else {
				return false;
		}
	}

	public void soigner()
	{
		hp=niveau*2;
	}
	
	public abstract void attaquer(Pokemon p);
	public abstract void subir(Pokemon p);
	
	public String toString()
	{
		return ("Je m'appelle "+nom+"\n Je suis de niveau "+niveau+
				"\n j'ai "+hp+" points de vie\n mon attaque de base est de "+attaque
				+"\n"+Type.afficherType(Type)+"\n");
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon "+nom+"] "+msg);
	}
}
