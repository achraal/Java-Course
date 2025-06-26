import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset;
import java.io.BufferedWriter;
import java.io.IOException;

public class App{
	public static void main(String[] args){
		
		Path f = Paths.get("infos.txt");
		
		System.out.println(Files.exists(f));
		
		Path p = Paths.get("newFile.txt");
		Path dir = Paths.get("Machin");
		

		try{
			Files.createFile(p);
			Files.createDirectory(dir);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Machin est un répertoire ? " + Files.isDirectory(dir));
		System.out.println("newFile est un fichier ? " + Files.isRegularFile(p));
	}
}