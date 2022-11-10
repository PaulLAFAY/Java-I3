
class Sherif extends Cowboy{
	
	protected int nbEmprisonne;
	
	public Sherif(String nom){
		this(nom, "whisky");
	}
	public Sherif(String nom, String boissonFavorite){
		super(nom, boissonFavorite, "honnete");
		popularite = 0;
		nbEmprisonne = 0;
	}
	
	public void emprisonne(Brigand brigand){
		parle("Au nom de loi, je vous arrete <"+brigand.getNom()+"> !");
		brigand.switchLibreStatus(this);
		nbEmprisonne++;
	}
	
	public void recherche(Brigand brigand){
		System.out.println("Affiche placarde partout en ville : OYEZ OYEZ BRAVES GENS ! <"+brigand.getRecompense()+">$ a qui arretera <"+brigand.getNom()+"> le brigand mort ou vif !");
	}
	
	public void presente(){
		super.presente();
		System.out.println("J'ai egalement coffre <"+nbEmprisonne+"> brigands !");
	}
	public String quelEstTonNom(){
		return "Sherif "+nom;
	}
	
}
