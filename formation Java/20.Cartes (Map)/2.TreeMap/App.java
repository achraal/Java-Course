import java.util.TreeMap;
import java.util.Map;

public class App 
{
    public static void main(String[] args)
    {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(1, "Marc");
        tm.put(2, null);
        tm.put(10, "achraf");
        tm.put(3, "Julie");

        System.out.println(tm.get(10));

        for(String k : tm.values())
            System.out.print("Les valeurs : " + k + " ");

        System.out.println("");

        for(Map.Entry<Integer, String> ent : tm.entrySet())
            System.out.println("Clés : " + ent.getKey() + " - Valeurs : " + ent.getValue());
    }
}