import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset;
import java.io.BufferedWriter;
import java.io.IOException;

public class App{
	public static void main(String[] args){
		
		Path p = Paths.get("infos.txt");
		StandardOpenOption mode = StandardOpenOption.CREATE_NEW;
		Charset c = Charset.forName("UTF-8");

		try{

			BufferedWriter bfw = Files.newBufferedWriter(p, c, mode);
			
			bfw.write("Bonjour");
			bfw.newLine();
			bfw.write(65); // caractère ASCII
			bfw.newLine();
			bfw.write("Achraf");
			bfw.newLine();
			bfw.write("Hello World!", 2, 5); // écrit une sous-chaîne de la chaîne
		
			bfw.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}