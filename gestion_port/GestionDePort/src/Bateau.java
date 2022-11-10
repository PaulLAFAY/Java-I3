
class Bateau {
	
	private Port depart, arrivee;
	private boolean enMer;
	
	public Bateau(){
		depart = null;
		arrivee = null;
		enMer = true;
	}
	public Bateau(Port port){
		depart = null;
		if(port.ajouterBateau()){
			 arrivee = port;
			 enMer = false;
		}
		else {
			arrivee = null;
			enMer = true;
		}
	}
	
	public boolean accoster(Port port){
		if(port.ajouterBateau()){
			arrivee = port;
			depart = null;
			enMer = false;
			return true;
		} else {
			arrivee = null;
			return false;
		}
	}
	
	public boolean quitter(){
		if(arrivee != null){
			depart = arrivee;
			arrivee = null;
			return true;
		} else return false;
	}
	
	public float distance(){
		if(arrivee != null && depart != null && arrivee != depart){
			return (float)Math.sqrt(Math.pow(arrivee.getX()-depart.getX(), 2)+Math.pow(arrivee.getY()-depart.getY(), 2));
		} else {
			return -1;
		}
	}
	
}
