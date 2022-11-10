
class Livre extends Document {
	
	private String auteur;
	private int nbPage;
	
	public Livre(){
		super();
		auteur = "defaut";
		nbPage = 1;
	}
	
	public String getAuteur(){
		return auteur;
	}
	
	public String toString(){
		return super.toString()+" auteur : "+auteur+" nbPage : "+nbPage;
	}
}
