
class Humain {
	
	protected final String nom;
	protected final String boissonFavorite;
	
	public Humain(String nom){
		this(nom, "eau");
	}
	public Humain(String nom, String boissonFavorite){
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
	}
	
	public void parle(String texte){
		System.out.println("<"+nom+"> - "+texte);
	}
	public void presente(){
		System.out.println("Bonjour ! Je m'appelle <"+nom+"> et ma boisson favorite est <"+boissonFavorite+">.");
	}
	public void boire(){
		System.out.println("Ah ! Un bon verre de <"+boissonFavorite+"> ! GLOUPS !");
	}
	public String quelEstTonNom(){
		return nom;
	}
	
	public String getNom(){
		return nom;
	}
	public String getBoissonFavorite(){
		return boissonFavorite;
	}
	public String getLook(){
		return "defaut";
	}
	public String getAdjectif(){
		return "defaut";
	}
	
}
