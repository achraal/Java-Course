public class Player {
    public Player()
    {
        this.mName = "Inconnu";
        this.mLevel = 0;
        System.out.println(this.mName + " - " + this.mLevel);
    }
    public Player(String name)
    {
        this.mName = name;
        this.mLevel = 0;
        System.out.println(this.mName + " - " + this.mLevel);
    }
    public Player(String name, int level)
    {
        this.mLevel = level;
        this.mName = name;
        System.out.println(this.mName + " - " + this.mLevel);
    }
    private String mName;
    private int mLevel;

    public void attack()
    {
        System.out.println(this.mName + " attaque une cible !");
    }
}