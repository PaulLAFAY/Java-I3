
class Document {
	
	private static int nbEnr;
	
	protected int numEnr;
	protected String titre;
	
	public Document(){
		numEnr = nbEnr;
		titre = "defaut";
	}
	
	public int getNumEnr(){
		return numEnr;
	}
	
	public String toString(){
		return "numEnr : "+numEnr+" titre : "+titre;
	}
}
