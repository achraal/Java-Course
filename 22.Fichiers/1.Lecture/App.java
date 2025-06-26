import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.IOException;

public class App{
	public static void main(String[] args){
		
		Path p = Paths.get("infos.txt");

		try{
			BufferedReader bfr = Files.newBufferedReader(p);
			
			// System.out.println(bfr.read());
			// bfr.skip(5);
			// System.out.println(bfr.readLine());
			
			String ligne;
            while ((ligne = bfr.readLine()) != null) {
                System.out.println(ligne);
            }
		
			bfr.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}