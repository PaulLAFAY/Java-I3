
class ListeDeDocuments {
	
	private Document listeDoc[] = new Document[1000];
	private int nbDoc;
	
	public ListeDeDocuments(){
		for(int i = 0; i < 1000; i++){
			listeDoc[i] = null;
		}
		nbDoc = 0;
	}
	
	public void addDoc(Document doc){
		listeDoc[nbDoc] = doc;
		nbDoc++;
	}
	
	public void tousLesAuteurs(){
		for(int i = 0; i < nbDoc; i++){
			System.out.print("numEnr : "+listeDoc[i].getNumEnr());
			if(listeDoc[i] instanceof Livre ){
				System.out.print(" Auteur : "+((Livre)listeDoc[i]).getAuteur());
			}
			System.out.println();
		}
	}
	
	public void tousLesDocuments(){
		for(int i = 0; i < nbDoc; i++){
			System.out.println(listeDoc[i]);
		}
	}
}
