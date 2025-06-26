import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class MainApp{
	public static void main(String[] args){
		
		Path fileSource = Paths.get("newFile.txt");
		Path dir = Paths.get("Machin");
		Path fileDestination = dir.resolve("copy.txt");
		
		Path fileToDelete = Paths.get("del.txt");
		Path fileToCheckBeforeDelete = Paths.get("chdel.txt");
		
		try{
			Files.copy(fileSource, fileDestination);
			System.out.println("Taille : " + Files.size(fileSource));
			Files.delete(fileToDelete);
			Files.deleteIfExists(fileToCheckBeforeDelete);
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}