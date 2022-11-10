
class Point {
	
	private int x, y;
	private String name;
	
	public Point(){
		this(0, 0, "defaut");
		
	}
	public Point(String name){
		this(0, 0, "defaut");
		
	}
	public Point(int x, int y, String name){
		this.x = x;
		this.y = y;
		this.name = name;
	}
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
		this.name = p.name;
	}
	
	public void setCoordo(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setCoordo(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public void translate(int x, int y){
		this.x += x;
		this.y += y;
	}
	
	public String getName(){
		return name;
	}
}
