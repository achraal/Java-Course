public class Creature{
	@SuppressWarnings({"unchecked", "preview"})
	public void fly(){
		System.out.println("Je vole ou pas...");
	}
	
	@Deprecated
	public void attack(){
		System.out.println("...");
	}
	
	
	public void eat(){
		System.out.println("Miam ...");
	}
}