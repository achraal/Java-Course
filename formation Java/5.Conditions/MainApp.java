public class MainApp
{
    public static void main(String[] args)
    {
        boolean value = (24 == 2);
        System.out.println(value);

        int val = 16;

        if(val == 24)
        {
            System.out.println("val = 24");
        }else{
            System.out.println("val = 16");
        }

        int val2 = 25;
        if(val2 < 0)
            System.out.println("value < 0");
        else if(val2 > 100)
            System.out.println("value > 100");
        else 
            System.out.println(val2);

        int option = 1;
        switch(option)
        {
            case 1: 
                System.out.println("option = 1");
                break;
            default:
                System.out.println("option != 1");
                break;
        }

        String choice = "yes";
        
        switch(choice)
        {
            case "yes":
                System.out.println("choice = yes");
                break;
            default:
                System.out.println("option = no");
                break;
        }
    }
}