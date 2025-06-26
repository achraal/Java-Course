public enum Color{
	RED("Rouge"), WHITE("Blanc"), GREEN("Vert");
	
	private String name;
	
	Color(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}