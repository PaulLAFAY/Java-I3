
class Individu {
	
	private static int nbCreate;
	
	private String nom, adresse;
	private String numtel;
	
	public Individu(){
		nom = "defaut";
		adresse = "defaut";
		numtel = "defaut";
		nbCreate++;
	}
	
	public String getNom(){
		return nom;
	}
	public String getAdresse(){
		return adresse;
	}
	public String getNumTel(){
		return numtel;
	}
	
	public void setNom(String val){
		nom = val;
	}
	public void setAdresse(String val){
		adresse = val;
	}
	public void setNumTel(String val){
		numtel = val;
	}
	
	public String toString(){
		return ("nom : " + nom + "	adresse : " + adresse + "	numTel : " + numtel);
	}
	
	public static int getnbCreate(){
		return nbCreate;
	}
}

