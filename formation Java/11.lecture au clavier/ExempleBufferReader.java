import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExempleBufferReader {
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Comment appeles-tu ?");
        String name = br.readLine();
        System.out.println("Bonjour " + name + " !");
    }     
}
