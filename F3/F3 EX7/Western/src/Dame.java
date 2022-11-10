
class Dame extends Humain{
	
	protected String couleurRobe;
	protected boolean libre;
	
	public Dame(String nom, String couleurRobe){
		this(nom, "lait", couleurRobe);
	}
	public Dame(String nom, String boissonFavorite, String couleurRobe){
		super(nom, boissonFavorite);
		this.couleurRobe = couleurRobe;
		libre = true;
	}
	
	public void switchLibreStatus(Humain humain){
		if(libre && humain instanceof Brigand){
			parle("AAAAAAAAAAH ! Le <"+humain.getLook()+"> <"+humain.getNom()+"> me kidnappe ! A l'aide !");
			libre = false;
		} else if(!libre && humain instanceof Cowboy){
			parle("Merci <"+humain.getAdjectif()+"> <"+humain.getNom()+">! Vous etes mon sauveur !");
			libre = true;
		}
	}
	
	public void changerRobe(String couleurRobe){
		this.couleurRobe = couleurRobe;
		parle("Regardez ma nouvelle robe <"+this.couleurRobe+"> !");
	}
	
	public String quelEstTonNom(){
		return "Miss "+nom;
	}
	public void presente(){
		super.presente();
		System.out.println("Ma robe est de couleur <"+couleurRobe+"> !");
	}
	
	public String getCouleurRobe(){
		return couleurRobe;
	}
	
}
