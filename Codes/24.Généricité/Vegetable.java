public class Vegetable{
	private String name;
	private Color color;
	
	public Vegetable(String name, Color color){
		this.name = name;
		this.color = color;
	}
	
	public Vegetable(String name){
		this.name = name;
		this.color = Color.WHITE;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	@Override
	public String toString(){
		return this.name + " de couleur " + this.color;
	}
}