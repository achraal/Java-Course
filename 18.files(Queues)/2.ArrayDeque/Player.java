public class Player
{
    public Player(String name, int level)
    {
        this.mName = name;
        this.mLevel = level;
    }
    public void hello()
    {
        System.out.println(this.mName + " dit bonjour !");
    }
    public String getName()
    {
        return this.mName;
    }
    private String mName;
    private int mLevel;
}