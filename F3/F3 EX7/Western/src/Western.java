/**
 * @(#)Western.java
 *
 * Western application
 *
 * @author 
 * @version 1.00 2022/2/28
 */
 
public class Western {
    
    public static void main(String[] args) {
    	
    	//I.1
    	Humain jean = new Humain("Jean", "biere");
    	jean.presente();
    	jean.boire();
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	//I.2
    	Dame elsa = new Dame("Elsa", "rouge");
    	Dame marie = new Dame("Marie", "bleu");
    	Dame clara = new Dame("Clara", "vert");
    	Cowboy pierre = new Cowboy("Pierre");
    	Brigand alphonse = new Brigand("Alphonse");
    	
    	elsa.changerRobe("orange");
    	alphonse.kidnappe(marie);
    	alphonse.kidnappe(clara);
    	
    	pierre.libereDame(clara);
    	pierre.tire(alphonse);
    	pierre.libereDame(marie);
    	
    	//I.3
    	marie.parle(marie.quelEstTonNom());
    	
    	//I.4
    	alphonse.presente();
    	pierre.presente();
    	clara.presente();
    	
    	//I.5
    	Barmen jack = new Barmen("Jack");
    	jack.presente();
    	jack.parle("Il fait beau aujoud'hui");
    	
    	//I.6
    	Sherif arthur = new Sherif("Arthur");
    	arthur.emprisonne(alphonse);
    	arthur.presente();
    	arthur.parle(arthur.quelEstTonNom());
    	
    	//I.7
    	Cowboy clint = new Sherif("Clint");
    	clint.presente();
    	clint.parle(clint.quelEstTonNom());
    	// clint.emprisonne(alphonse);    impossible
    	
    }
}
