import java.util.Scanner;

/**
 * Created by mickael.marcelat on 13/03/2017.
 */
public class User
{
    Scanner sc = new Scanner(System.in);
    String prenomUser;
    String nomUser;
    int ageUser;
    String villeUser;


    public User()
    {
        System.out.println("Création d'un utilisateur");
        prenomUser = "Inconnu";
        nomUser = "Inconnu";
        ageUser = 0;
        villeUser = "Inconnu";
    }

    public User(String pPrenom, String pNom)
    {
        System.out.println("Création d'un utilisateur avec 2 paramètres");
        prenomUser = pPrenom;
        nomUser = pNom;
    }

    public User(String pPrenom, String pNom, int pAge, String pVille)
    {
        System.out.println("Création d'un utilisateur avec plusieurs paramètres");
        prenomUser = pPrenom;
        nomUser = pNom;
        ageUser = pAge;
        villeUser = pVille;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    public String getVilleUser() {
        return villeUser;
    }

    public void setVilleUser(String villeUser) {
        this.villeUser = villeUser;
    }

    public void modifyInfo() {
        System.out.println("Ton prénom :");
        prenomUser = sc.nextLine();
        System.out.println("Ton nom :");
        nomUser = sc.nextLine();
        System.out.println("Ton age :");
        ageUser = sc.nextInt();
        sc.nextLine();
        System.out.println("Ta ville :");
        villeUser = sc.nextLine();
    }

    public void writeMsg()
    {

    }

    public void showAllMsg()
    {

    }

    public void showInfo()
    {

    }

    public void addFriend()
    {

    }

    public void showFriend()
    {

    }
}
