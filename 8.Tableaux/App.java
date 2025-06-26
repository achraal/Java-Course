import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        int tab[] = {1, 2, 3};
        System.out.println("Premier indice du tableau : " + tab[0] + "\n");

        for(int i = 0 ; i < tab.length ; ++i)
            System.out.println("Indice " + i + " = " + tab[i]);

        System.out.println(" \nAffichage avec boucle for améliorée (for each) \n");

        for(int number : tab)
            System.out.println(number);

            System.out.println("\nUne matrice : \n");

        int[][] matrice = {
            {1,2,3}, 
            {4,5,6}
        };

        for(int i = 0 ; i < matrice.length ; ++i)
            for(int j = 0 ; j < matrice[i].length ; ++j)
                System.out.println("Indice premier tableau : " + i + " et indice du deuxième tableau : " + j + " = " + matrice[i][j]);

        System.out.println("\nAffichage de la matrice avec boucle for améliorée (for each) \n");

        for(int[] i : matrice)
            for(int j : i)
                System.out.println(j);

        System.out.println("\nAffichage d'un tableau avec une méthode : \n");
        int[] tableau = {1,2,3,4,5,6,7,8,9};
        printTab(tableau);

        System.out.println("\n");

        int[] tab2 = new int[5];
        Arrays.fill(tab2, 15);
        for(int elements : tab2)
            System.out.println(elements);
    }

    public static void printTab(int[] t)
    {
        for(int element : t)
            System.out.println(element);
    }
}