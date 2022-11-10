
class Barmen extends Humain{
	
	protected final String nomBar;
	
	public Barmen(String nom){
		this(nom, "Chez "+nom);
	}
	public Barmen(String nom, String nomBar){
		super(nom, "vin");
		this.nomBar = nomBar;
	}
	
	public void presente(){
		super.presente();
		System.out.println("Mon bar s'appelle <"+nomBar+"> !");
	}
	public void parle(String texte){
		super.parle(texte+" Coco.");
	}
	
}
