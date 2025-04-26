import java.util.ArrayDeque;
import java.util.Iterator;
public class Main
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
        adq.addFirst(4);
        adq.addFirst(15);
        adq.addLast(0);

        Iterator it = adq.iterator();

        while(it.hasNext()){System.out.println("Les éléments sont : " + it.next());}

        adq.removeFirst();
        Iterator it2 = adq.iterator();
        while(it2.hasNext()){System.out.println("Les éléments après suppression : " + it2.next());}

        System.out.println(adq.getFirst());
        System.out.println(adq.peekFirst());


        ArrayDeque<Integer> adqq = new ArrayDeque<Integer>();
        adqq.addLast(4);
        adqq.addLast(-84);
        adqq.addLast(155);
        adqq.addLast(4);
        
        adqq.removeLastOccurrence(4);
        Iterator it3 = adqq.iterator();
        while(it3.hasNext()){System.out.println("Eléments restants : " + it3.next());}

        ArrayDeque<Player> tap = new ArrayDeque<Player>();
        tap.addFirst(new Player("achraf", 50));

        Iterator i = tap.iterator();
        while(i.hasNext()){System.out.println(i.next());}
    }
}