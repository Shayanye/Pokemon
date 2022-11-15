package pokemon;
import java.util.Random;

public class Pokemon0 {

	private String nom;
	private int attaque;
	private int hp;
	private int niveau;
	private static java.util.Random random=new Random();
	private int valeur=random.nextInt(11);
	
	public Pokemon0(String nom) {
		this.nom=nom;
		if(valeur==0) {
			this.valeur=1;
		}else {
		this.niveau=valeur;}
		
		this.hp=niveau*2;
		this.attaque=(niveau/2)+1;
		
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
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
		if(hp==0)
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
	
	public void attaquer(Pokemon0 p)
	{
		p.hp=p.hp-attaque;
	}
	
	public String toString()
	{
		return ("Je m'appelle "+nom+"\n Je suis de niveau "+niveau+"\n j'ai "+hp+" points de vie\n mon attaque de base est de "+attaque);
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon "+nom+"] "+msg);
	}
}
