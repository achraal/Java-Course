public enum Color{
	RED("Rouge", "FF0000"), BLUE("Bleu", "0000FF"), GREEN("Vert", "00FF00");
	
	private String name;
	private String hexValue;
	
	Color(String name, String hexValue){
		this.name = name;
		this.hexValue = hexValue;
	}
	
	@Override 
	public String toString(){
		return "La couleur " + this.name + "[" + this.hexValue + "]";
	}
	
	public String getHexValue(){
		return this.hexValue;
	}
}