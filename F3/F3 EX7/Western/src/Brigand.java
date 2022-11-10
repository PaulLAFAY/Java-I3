
class Brigand extends Humain{
	
	protected String look;
	protected int nbDameCapture;
	protected final int recompense;
	protected boolean libre;
	
	public Brigand(String nom){
		this(nom, "tord-boyaux", "mechant", 100);
	}
	public Brigand(String nom, String boissonFavorite, String look, int recompense){
		super(nom, boissonFavorite);
		this.look = look;
		this.recompense = recompense;
		nbDameCapture = 0;
		libre = true;
	}
	
	public void kidnappe(Dame dame){
		dame.switchLibreStatus(this);
		nbDameCapture++;
		parle("Ah Ah ! <"+dame.getNom()+"> tu es mienne desormais !");
	}
	
	public void switchLibreStatus(Cowboy cowboy){
		parle("Damned, je suis fait ! <"+cowboy.getNom()+">, tu m'as eu !");
	} 
	
	public String quelEstTonNom(){
		return nom+" le "+look;
	}
	public void presente(){
		super.presente();
		System.out.println("J'ai l'air <"+look+"> et j'ai deja kindappe <"+nbDameCapture+"> dames !");
		System.out.println("Ma tete est mise a prix <"+recompense+">$ !");
	}
	
	public String getLook(){
		return look;
	}
	public int getRecompense(){
		return recompense;
	}
}
