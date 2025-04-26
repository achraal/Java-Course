import java.util.Stack;
import java.util.ListIterator;
public class App
{
    public static void main(String[] args)
    {
        Stack<Cat> group = new Stack<Cat>();

        Cat c1 = new Cat("Toudoux");
        Cat c2 = new Cat("Popy");
        Cat c3 = new Cat("Pilou");

        group.push(c1);
        group.push(c2);
        group.push(c3);

        ListIterator<Cat> lit = group.listIterator();

        while(lit.hasNext())
            lit.next().meow();

        System.out.println("Instance : " + group.peek());
        System.out.println("Sommet : ");
        group.peek().meow();
    }
}