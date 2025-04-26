import java.util.PriorityQueue;
import java.util.Iterator;
public class App
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(155);
        pq.add(0);
        pq.add(8);
        pq.add(8);
        pq.add(365);
        // pq.add(null); Erreur
        pq.add(-14);

        Iterator it = pq.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(pq.peek());
        System.out.println(pq.element());

        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}