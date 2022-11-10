/**
 * @(#)Biblio.java
 *
 * Biblio application
 *
 * @author 
 * @version 1.00 2022/2/21
 */
 
public class Biblio {
    
    public static void main(String[] args) {
    	
    	ListeDeDocuments listeDoc = new ListeDeDocuments();
    	
    	listeDoc.addDoc(new Livre());
    	listeDoc.addDoc(new Document());
    	listeDoc.addDoc(new Dictionnaire());
    	
    	listeDoc.tousLesAuteurs();
    	
    	listeDoc.tousLesDocuments();
    	
    }
}
