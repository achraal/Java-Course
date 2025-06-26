import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Année de naissance : ");
            int yearOfBirth = sc.nextInt();
            System.out.println(yearOfBirth);
        }
        catch(InputMismatchException e)
        {
            System.out.println("La date de naissance est invalide !");
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        finally
        {
            System.out.println("Fin du programme");
        }
    }
}