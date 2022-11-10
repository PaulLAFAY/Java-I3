
class Cowboy extends Humain{
	
	protected int popularite;
	protected String adjectif;
	
	public Cowboy(String nom){
		this(nom, "whisky", "vaillant");
	}
	public Cowboy(String nom, String boissonFavorite, String adjectif){
		super(nom, boissonFavorite);
		this.adjectif = adjectif;
		popularite = 0;
	}
	
	public void tire(Brigand brigand){
		System.out.println("Le <"+adjectif+"> <"+nom+"> tire sur le <"+brigand.getLook()+"> <"+brigand.getNom()+">. PAN !");
		parle("Prend ça, <"+brigand.getLook()+"> <"+brigand.getNom()+"> !");
	}
	
	public void libereDame(Dame dame){
		parle("Jolie <"+dame.getNom()+"> en robe <"+dame.getCouleurRobe()+">, vous etes libre desormais !");
		dame.switchLibreStatus(this);
		popularite++;
	}
	
	public String quelEstTonNom(){
		return nom;
	}
	public void presente(){
		super.presente();
		System.out.println("La population me trouve <"+adjectif+"> et j'ai une popularite de <"+popularite+"> !");
	}
	
	public String getAdjectif(){
		return adjectif;
	}
}
