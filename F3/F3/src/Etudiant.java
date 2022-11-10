
class Etudiant extends Individu {
	
	private String formation;
	private int numero;
	
	public Etudiant(){
		super();
		formation = "formation par defaut";
		numero = 0;
	}
	
	public String toString(){
		return (super.toString()+"	formation : "+formation+"	numero : "+numero);
	}
	
}
