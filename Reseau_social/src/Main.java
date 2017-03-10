import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
        String prenom = "Mickael";
        String nom = "Marcelat";
        int age = 27;
        String ville = "Grenoble";

        System.out.println(prenom);
        System.out.println(nom);
        System.out.println(age);
        System.out.println(ville);
        */

        String boucle = "oui";

        while(boucle.equals("oui")) {

            Scanner entrer = new Scanner(System.in);

            System.out.println("Ton prénom :");
            String res1 = entrer.nextLine();

            System.out.println("Ton nom :");
            String res2 = entrer.nextLine();

            System.out.println("Ton age :");
            int res3 = entrer.nextInt();

            entrer.nextLine();

            System.out.println("Ta ville :");
            String res4 = entrer.nextLine();

            System.out.println("Bonjour, " + res1 + " " + res2 + " tu as " + res3 + " ans et tu habites à " + res4 + " !");

            System.out.println("Encore une fois ? [oui/non]");
            boucle = entrer.nextLine();

        }
    }
}
