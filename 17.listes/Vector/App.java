import java.util.Vector;

public class App
{
    public static void main(String[] args)
    {
        Vector<Cat> group = new Vector<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Maki");

        group.add(c1);
        group.add(c2);
        group.add(c3);

        System.out.println("Capacité : " + group.capacity());
        
        for(Cat c : group)
            c.meow();
    }
}