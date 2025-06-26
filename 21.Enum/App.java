public class App{
	public static void main(String[] args){
		Color c = Color.BLUE;
		Color c1 = Color.RED;
		Color c2 = Color.BLUE;
		
		if(c == c2){
			System.out.println("Same Colors"); //Comparer 
		} 
		
		System.out.println(c.toString());
		
		System.out.print("La valeur de la couleur verte : " + Color.RED.valueOf("GREEN") + "\n");
		System.out.print("L'ordre de la couleur rouge : " + Color.RED.ordinal() + "\n");
		System.out.print("Le nom de la couleur : " + Color.RED.name() + "\n");
		
		System.out.println("Parcours de l'Enum : ");
		
		for(Color colors : Color.values()){
			System.out.println(colors);
		}
	}
}