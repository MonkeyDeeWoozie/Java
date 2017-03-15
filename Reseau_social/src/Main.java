import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Menu myMenu = new Menu();
        User myUser = new User();
        myUser.modifyInfo();
        myMenu.showMenu();

        int answer = sc.nextInt();
        sc.nextLine();

        do
        {
            switch(answer)
            {
                case 1 : myUser.modifyInfo();
                case 2 : myUser.showInfo();
                case 3 : myUser.writeMsg();
                case 4 : myUser.showAllMsg();
                case 5 : myUser.addFriend();
                case 6 : myUser.showFriend();
                case 7 : //exit
            }
            myMenu.showMenu();
        } while(true);

        /*int i_msg = 0;
        int numeroMessage;
        String[] messageTable = new String[10];

        int i_ami = 0;
        int numeroAmi;
        String[] listeAmi = new String[10];

            System.out.println("Tu veux afficher ton profil ?");
            afficherProfil = sc.nextLine();
            if ("oui".equals(afficherProfil))
            {
                System.out.println("Bonjour, " + prenom + " " + nom + " tu as " + age + " ans et tu habites à " + ville + " !");
            }



                messageTable[i_msg] = sc.nextLine();
                i_msg++;
                i_msg = i_msg%10;
                System.out.println("Tu veux afficher ton message ?");
                affichage = sc.nextLine();
                if("oui".equals(affichage))
                {
                    System.out.println("Quel numero de message ?");
                    numeroMessage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ton message est : " + messageTable[numeroMessage]);
                }
            }

            System.out.println("Tu veux avoir un ami ? (pour les solitaires : Pendez-vous !");
            aUnAmi = sc.nextLine();
            if ("oui".equals(aUnAmi))
            {
               System.out.println("Le nom de ton ami :");
               listeAmi[i_ami] = sc.nextLine();
               i_ami++;
               i_ami = i_ami%10;
               System.out.println("Veux-tu afficher le nom de ton ami ?");
               afficherNomAmi = sc.nextLine();
               if("oui".equals(afficherNomAmi))
               {
                   System.out.println("Quel numéro d'ami tu veux ma gueule ?");
                   numeroAmi = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Le nom de ton ami est : " + listeAmi[numeroAmi]);
               }
            }

            System.out.println("Encore un autre utilisateur ? [oui/non]");
            boucle = sc.nextLine();
        }
        */
    }
}
