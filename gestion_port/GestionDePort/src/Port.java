
class Port {
	
	private float x, y;
	private Quai quais;
	
	public Port(float x, float y){
		this.x = x;
		this.y = y;
		quais = new Quai();
	}
	public Port(float x, float y, int nbQuais){
		this.x = x;
		this.y = y;
		quais = new Quai(nbQuais);
	}
	
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}
	
	public boolean ajouterBateau(){
		return quais.ajouterBateau();
	}
	
	public boolean retirerBateau(){
		return quais.retirerBateau();
	}
	
}
