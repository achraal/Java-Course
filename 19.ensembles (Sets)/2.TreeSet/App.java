import java.util.TreeSet;
public class App 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> hs = new TreeSet<Integer>();

        hs.add(15);
        hs.add(-4);
        hs.add(388);
        hs.add(1);
        hs.add(-1);
        hs.add(155);
        hs.add(-4220);

        if (hs.contains(388)){System.out.println("oui");}

        hs.add(-4);

        for(Integer nb : hs)
            System.out.println(nb);

        System.out.println("Premier élément : " + hs.first());
        System.out.println("Dernier élément : " + hs.last());
        System.out.println("Premier Ensemble : " + hs.headSet(1));
        System.out.println("Dernier Ensemble : " + hs.tailSet(1));
        System.out.println("Mon propre ensemble : " + hs.subSet(-4, 388));
    }   
}