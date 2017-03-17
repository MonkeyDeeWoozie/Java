import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // Instancié pour récuperer ce que l'utilisateur va taper sur son clavier
        Scanner sc = new Scanner(System.in);
        // Instancier la classe Menu
        Menu myMenu = new Menu();
        // Instancie la classe User
        User myUser = new User();
        // Appel de la methode modifyInfo
        myUser.modifyInfo();

        boolean bouclette = true;

        do
        {
            System.out.println();
            myMenu.showChoice();
            int reppe = sc.nextInt();
            sc.nextLine();
            switch(reppe)
            {
                // cas avec appel de methode
                case 1 : myMenu.showMenu( 1);
                    break;
                case 2 : myMenu.showMenu(2);
                    break;
                case 3 : bouclette = false;
                    break;
                // choix par defaut
                default : System.out.println("Choix non disponible");
            }
        } while(bouclette);

        // Déclaration de variable qui va etre utile dans ma boucle do while
        boolean boucle = true;
        // boucle
        do
        {
            System.out.println();
            // Appel de la methode showMenu de la classe Menu

            myMenu.showMenu();

            // Choix de la réponse pour le menu
            int answer = sc.nextInt();
            sc.nextLine();
            // Switch pour le choix du menu
            switch(answer)
            {
                // cas avec appel de methode
                case 1 : myUser.modifyInfo();
                    break;
                case 2 : myUser.showInfo();
                    break;
                case 3 : myUser.writeMsg();
                    break;
                case 4 : myUser.showAllMsg();
                    break;
                case 5 : myUser.addFriend();
                    break;
                case 6 : myUser.showFriend();
                    break;
                case 7 : boucle = false;
                    break;
                // choix par defaut
                default : System.out.println("Choix non disponible");
            }
        } while(boucle);
    }
}
