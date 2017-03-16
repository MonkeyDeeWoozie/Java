import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Menu myMenu = new Menu();
        User myUser = new User();
        myUser.modifyInfo();
        boolean boucle = true;
        do
        {
            myMenu.showMenu();
            int answer = sc.nextInt();
            sc.nextLine();
            switch(answer)
            {
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
                default : System.out.println("Choix non disponible");
            }
        } while(boucle);
    }
}
