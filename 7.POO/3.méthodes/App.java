public class App {
    public static void main(String[] args)
    {
        prog();
        //pas mal de choses
        prog();

        System.out.println(getNumberTwo());
        System.out.println(getNumber());

        String message = say("Hello !", 28);
        System.out.println(message);

        
        System.out.println(sum (2, 5));
        System.out.println(sum (2.3, 5.6));

        Player p = new Player();
        Player p1 = new Player("Achraf");
        Player p2 = new Player("Achraf", 28);
        p1.attack();
    }
    public static void prog()
    {
        System.out.println("Bonjour");
        System.out.println("Comment allez vous ?");

        //modifiaction
        System.out.println("Moi Bien");
    }

    public static int getNumberTwo()
    {
        return 2;
    }

    public static int getNumber()
    {
        boolean info = true;
        if(info)
            return 1;
        else
            return 0;
    }
    public static String say(String msg, int nb)
    {
        System.out.println(msg);
        msg = "World !";
        return msg + nb;
    }
    public static int sum(int a, int b)
    {
        return a + b;
    }
    public static double sum(double a, double b)
    {
        return a + b;
    }
}