
class Point {
	
	private static int nombre;
	
	private int abscisse;
	private int ordonnee;
	private int numero;
	
	public Point(){ this(0, 0); }
	public Point(int u, int v){
		abscisse = u;
		ordonnee = v;
		numero = nombre;
		nombre++;
	}
	
	public void set(int u, int v){
		abscisse = u;
		ordonnee = v;
	}
	
	public void set(Point p){
		abscisse = p.abscisse;
		ordonnee = p.ordonnee;
	}
	
	public void translate(int u, int v){
		abscisse += u;
		ordonnee += v;
	}
	
	public void affiche(){
		System.out.println("Point numero : " + numero + "	x : " + abscisse + "	y : " + ordonnee + "	Nombre total de points : " + nombre);
	}
	
	public boolean isOrigin(){
		return (abscisse == 0 && ordonnee == 0);
	}
	
	public boolean equals(Point p){
		return (abscisse == p.abscisse && ordonnee == p.ordonnee);
	}
	
	public Point symetrie(){
		Point p = new Point(-abscisse, -ordonnee);
		return p;
	}
	
}
