public class App {
    public static void main(String[] args)
    {
        String s = "Hello";
        System.out.println(s);

        s = "Bonjour";
        System.out.println(s);

        String s2 = new String("tout le monde");
        System.out.println(s + " " + s2);

        String s3 = "      Yo !   ";
        System.out.println(s.concat(" ").concat(s2));
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s3.trim());
        System.out.println(s3.replace("o", "up"));
        System.out.println(s.charAt(0));
        System.out.println(s2.substring(5, 7));
        System.out.println(s.equals(s3));
        System.out.println(s.compareTo(s3));
    }
}
