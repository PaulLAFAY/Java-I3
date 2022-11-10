
class Dictionnaire extends Document {
	
	private String langue;
	private int nbTome;
	
	public Dictionnaire() {
		super();
		langue = "defaut";
		nbTome = 1;
	}
	
	public String toString(){
		return super.toString()+" langue : "+langue+" nbTome : "+nbTome;
	}
}
