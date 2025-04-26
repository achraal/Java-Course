public class MainApp 
{
    public static void main(String[] args)
    {
        int age = 24;
        System.out.println("Tu as " + age + "ans");

        int result = 7 / 2;
        System.out.println(result);

        double result3 = (double) 7 / 2;
        System.out.println(result3);

        int result2 = 7 % 2;
        System.out.println(result2);

        int exp = 0;
        int exp2 = exp++;
        int exp3 = ++exp;
        System.out.println(exp);
        System.out.println(exp2);

        System.out.println(exp3);
    }
}