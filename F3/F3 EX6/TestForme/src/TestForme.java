/**
 * @(#)TestForme.java
 *
 * TestForme application
 *
 * @author 
 * @version 1.00 2022/2/21
 */
 
public class TestForme {
    
    public static void main(String[] args) {
    	
    	Triangle tri = new Triangle(new Point(1, 2, "a"), new Point(3, 4, "b"), new Point(5, 6, "c"));
    	System.out.println(tri);
    	/*tri.modifierPoint("a", 0, 1);
    	tri.modifierPoint("b", 1, 0);
    	tri.modifierPoint("c", -1, 0);
    	System.out.println(tri);*/
    	System.out.println(tri.getPerimetre());
    	System.out.println("Hauteur: "+tri.getHauteur()+"   Largeur: "+tri.getLargeur()+"   Surface: "+tri.getSurface());
    	
    	Quadrilatere quad = new Quadrilatere(new Point(1, 2, "a"), new Point(3, 4, "b"), new Point(5, 6, "c"), new Point(7, 8, "d"));
    	System.out.println(quad);
    	quad.modifierPoint("b", 8, 9);
    	System.out.println(quad);
    	
    	Rectangle rect = new Rectangle(new Point(0, 1, "a"), new Point(1, 0, "c"));
    	rect.construire();
    	System.out.println(rect);
    	
    	rect = new Rectangle(new Point(2, 4, "a"), new Point(4, 2, "c"));
    	System.out.println(rect);
    	System.out.println(rect.getPerimetre());
    	System.out.println("Hauteur: "+rect.getHauteur()+"   Largeur: "+rect.getLargeur()+"   Surface: "+rect.getSurface());
    	
    	EnsemblePolygone ensPol = new EnsemblePolygone(10);
    	ensPol.ajouterPolygone(tri);
    	ensPol.ajouterPolygone(rect);
    	System.out.println(ensPol.sommePerimetres());
    	
    }
}
