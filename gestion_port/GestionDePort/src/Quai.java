
class Quai {
	
	private int nbQuais, quaisOcc;
	
	public Quai(){
		nbQuais = 3;
		quaisOcc = 0;
	}
	public Quai(int nbQuais){
		if(nbQuais > 0) this.nbQuais = nbQuais;
		else this.nbQuais = 3;
		quaisOcc = 0;
	}
	
	public boolean ajouterBateau(){
		if(quaisOcc < nbQuais){
			quaisOcc++;
			return true;
		} else return false;
	}
	
	public boolean retirerBateau(){
		if(quaisOcc > 0){
			quaisOcc--;
			return true;
		}
		else return false;
	}
	
}
