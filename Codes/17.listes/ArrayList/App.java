import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<Cat> group = new ArrayList<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Maki");

        group.add(c1);
        group.add(c2);
        group.add(c3);

        System.out.println("Taille : " + group.size());
            for(Cat c : group)
            c.meow();

        System.out.println(group.get(0));
        group.remove(1);

        for(Cat c : group)
            c.meow();

        group.clear();

        for(Cat c : group)
            c.meow();
    }
}