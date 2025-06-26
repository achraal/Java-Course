import java.util.HashMap;
public class App 
{
    public static void main(String[] args)
    {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("1", "Marc");
        hm.put("2", "Luc");
        hm.put("15", "achraf");
        hm.put("3", "Julie");

        System.out.println(hm.get("15"));

        if(hm.containsKey("2")){System.out.println("La clé 2 existe");}
        if(hm.containsValue("achraf")){System.out.println("achraf existe");}

        for(String k : hm.keySet())
            System.out.print("Les clés : " + k + " ");
    }
}