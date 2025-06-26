import java.util.StringTokenizer;

public class MainApp {
    public static void main(String[] args)
    {
        String s = "news/titre-de-la-news/14";
        StringTokenizer st = new StringTokenizer(s, "/");

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        StringBuilder sBuilder = new StringBuilder();
        System.out.println(sBuilder.capacity());
        System.out.println(sBuilder.length());

        sBuilder.append(" tout le monde");
        System.out.println(sBuilder);

        sBuilder.insert(0, "Bonjour");
        System.out.println(sBuilder);

        StringBuffer sBuffer = new StringBuffer();
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.length());

        sBuffer.append(" tout le monde");
        System.out.println(sBuffer);

        sBuffer.insert(0, "Bonjour");
        System.out.println(sBuffer);

        String ss = "a";
        String s2 = "b";

        StringBuilder sb = new StringBuilder(ss).append(s2); //équivalent à sb = ss + s2;
        System.out.println(sb);
    }
}
