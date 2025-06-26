public class App
{
    public static void main(String[] args)
    {
        System.out.println("ENRIGETREMENTS : " + SoftwareRegistration.getNumberOfRegistrations());
        SoftwareRegistration sr = new SoftwareRegistration(2025);

        sr.setExpirationYear(2050);
        System.out.println("Nouvelle date : " + sr.getExpirationYear());
        System.out.println("ENRIGETREMENTS : " + SoftwareRegistration.getNumberOfRegistrations());

        SoftwareRegistration sr1 = new SoftwareRegistration(2024);
        System.out.println("ENRIGETREMENTS : " + SoftwareRegistration.getNumberOfRegistrations());

        SoftwareRegistration sr2 = new SoftwareRegistration(2003);

        System.out.println("ENRIGETREMENTS : " + SoftwareRegistration.getNumberOfRegistrations());
    }
}