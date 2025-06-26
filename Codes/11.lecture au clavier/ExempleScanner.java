import java.util.Scanner;

public class ExempleScanner {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Accéder à quel niveau ?");
        int game_level = sc.nextInt();
        
        System.out.println("Niveau : " + game_level);
    }     
}