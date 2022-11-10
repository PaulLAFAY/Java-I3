
class Triangle extends Polygone{
	
	private Point a, b, c;
	
	public Triangle(Point a, Point b, Point c){
		this.a = new Point(a);
		this.b = new Point(b);
		this.c = new Point(c);
	}
	
	public void modifierPoint(String name, int x, int y){
		if(a.getName() == name){
			a.setCoordo(x, y);
		} else if(b.getName() == name){
			b.setCoordo(x, y);
		} else if(c.getName() == name){
			c.setCoordo(x, y);
		}
	}
	
	public int getHauteur(){
		return a.getY()-b.getY();
	}
	
	public int getLargeur(){
		return b.getX()-c.getX();
	}
	
	public int getSurface(){
		return (int)(0.5*getHauteur()*getLargeur());
	}
	
	public int getPerimetre(){
		return (int)(Math.sqrt((a.getX()-b.getX())^2+(a.getY()-b.getY())^2)+Math.sqrt((b.getX()-c.getX())^2+(b.getY()-c.getY())^2)+Math.sqrt((c.getX()-a.getX())^2+(c.getY()-a.getY())^2));
	}
	
	public String toString(){
		return a.getName()+": "+a.getX()+" "+a.getY()+"   "+b.getName()+": "+b.getX()+" "+b.getY()+"   "+c.getName()+": "+c.getX()+" "+c.getY();
	}
}
