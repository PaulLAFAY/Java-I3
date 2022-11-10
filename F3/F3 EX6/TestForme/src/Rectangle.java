
class Rectangle extends Quadrilatere{
	
	public Rectangle(Point a, Point b, Point c, Point d){
		super(a, b, c, d);
	}
	public Rectangle(Point a, Point c){
		super(a, new Point(c.getX(), a.getY(), "b"), c, new Point(c.getY(), a.getX(), "d"));
	}
	
	public void construire(){
		b = new Point(c.getX(), a.getY(), "b");
		d = new Point(c.getY(), a.getX(), "d");
	}
	
	public int getHauteur(){
		return a.getY()-c.getY();
	}
	
	public int getLargeur(){
		return b.getX()-a.getX();
	}
	
	public int getSurface(){
		return getHauteur()*getLargeur();
	}
	
	public int getPerimetre(){
		return getHauteur()*2+getLargeur()*2;
	}
	
}
