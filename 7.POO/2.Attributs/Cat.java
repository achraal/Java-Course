public class Cat {
    public Cat(String name, int age)
    {
        this.mName = name;
        this.Age = age;

        System.out.println(this.mName + " - " + this.Age);
    }

    private String mName;
    private int Age;
}
