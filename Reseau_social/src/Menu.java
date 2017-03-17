import java.util.*;

/**
 * Created by mickael.marcelat on 14/03/2017.
 */
public class Menu
{
    Scanner sc = new Scanner(System.in);
    public int rep1;

    // Constructeur vide
    public Menu()
    {
        // Constructeur vide
    }

    public void showChoice()
    {
        System.out.println("Êtes vous : \n" +
                            "1. Un utilisateur \n" +
                            "2. Un modérateur \n" +
                            "3. Ne pas choisir");

    }
    // Methode pour montrer le menu avec les choix disponobles
    public void showMenu(int rep1)
    {
        if (rep1 == 1) // UTILISATEUR
        {
            System.out.println("Que voulez-vous faire ? \n" +
                    "1. Modifier infos utilisateur \n" +
                    "2. Montrer les informations \n" +
                    "3. Ecrire un message \n" +
                    "4. Montrer tout les messages \n" +
                    "5. Ajouter un ami \n" +
                    "6. Montrer tout les amis \n" +
                    "7. Quitter l'application");
        }
        else if (rep1 == 2) // MODERATEUR
            {
               System.out.println("Que voulez-vous faire ? \n" +
                       "1. Modifier infos utilisateur \n" +
                       "2. Montrer les informations \n" +
                       "3. Ecrire un message \n" +
                       "4. Montrer tout les messages \n" +
                       "5. Ajouter un ami \n" +
                       "6. Montrer tout les amis \n" +
                       "7. Quitter l'application");
            }
    }
}
