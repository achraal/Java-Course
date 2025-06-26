import java.util.HashSet;
public class App 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(15);
        hs.add(-4);
        hs.add(388);

        if (hs.contains(388)){System.out.println("oui");}

        hs.remove(388);

        if (!(hs.contains(388))){System.out.println("non");}

        hs.add(-4);

        for(Integer nb : hs)
            System.out.println(nb);
    }   
}