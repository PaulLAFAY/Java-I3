
class Quadrilatere extends Polygone{
	
	protected Point a, b, c, d;
	
	public Quadrilatere(Point a, Point b, Point c, Point d){
		this.a = new Point(a);
		this.b = new Point(b);
		this.c = new Point(c);
		this.d = new Point(d);
	}
	
	public void modifierPoint(String name, int x, int y){
		if(a.getName() == name){
			a.setCoordo(x, y);
		} else if(b.getName() == name){
			b.setCoordo(x, y);
		} else if(c.getName() == name){
			c.setCoordo(x, y);
		} else if(d.getName() == name){
			d.setCoordo(x, y);
		}
	}
	
	public String toString(){
		return a.getName()+": "+a.getX()+" "+a.getY()+"   "+b.getName()+": "+b.getX()+" "+b.getY()+"   "+c.getName()+": "+c.getX()+" "+c.getY()+"   "+d.getName()+": "+d.getX()+" "+d.getY();
	}
}
