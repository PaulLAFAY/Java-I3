
class EnsemblePolygone {
	
	private Polygone[] pol;
	private final int nbPolMax;
	private int nbPol;
	
	public EnsemblePolygone(int n){
		nbPolMax = n;
		nbPol = 0;
		pol = new Polygone[nbPolMax];
		for(int i = 0; i < n; i++){
			pol[i] = null;
		}
	}
	
	public void ajouterPolygone(Polygone pol){
		if(nbPol < nbPolMax){
			this.pol[nbPol] = pol;
			nbPol++;
		}
	}
	
	public int sommePerimetres(){
		int per = 0;
		for(int i = 0; i < nbPol; i++){
			per += pol[i].getPerimetre();
		}
		return per;
	}
	
}
