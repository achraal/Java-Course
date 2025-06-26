public class SoftwareRegistration {
    public SoftwareRegistration (int expiration)
    {
        if(mNumberOfRegistrations > 0)
        {
            this.mExpirationYear = expiration;
            System.out.println("Enregistrement du produit, valide jusqu'en " + this.mExpirationYear);
            mNumberOfRegistrations--;

            System.out.println("Logiciel valide (expiration : " + this.mExpirationYear +")");
            System.out.println("Enregistrements restants : " + mNumberOfRegistrations);
        }
        else{
            System.out.println("Maximum de validation effectuée");
        }

    }
    public int getExpirationYear()
    {
        return this.mExpirationYear;
    }

    public void setExpirationYear(int newExpiration)
    {
        this.mExpirationYear = newExpiration;
    }

    public static int getNumberOfRegistrations()
    {
        return mNumberOfRegistrations;
    }

    private int mExpirationYear;
    private static int mNumberOfRegistrations = 2;
}
