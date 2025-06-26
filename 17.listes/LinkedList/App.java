import java.util.LinkedList;
import java.util.ListIterator;
public class App
{
    public static void main(String[] args)
    {
        LinkedList<Cat> group = new LinkedList<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Pilou");

        group.add(c1);
        group.add(c2);
        group.addFirst(c3);

        ListIterator<Cat> lit = group.listIterator();

        while(lit.hasNext())
            lit.next().meow();

    }
}