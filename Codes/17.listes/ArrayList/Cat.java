public class Cat
{
    public Cat(String name)
    {
        this.mName = name;
    }
    public void meow()
    {
        System.out.println(this.mName + ": Meow !");
    }
    private String mName;
}