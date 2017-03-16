import java.util.Scanner;

/**
 * Created by mickael.marcelat on 13/03/2017.
 */
public class User
{
    // Déclaration des attributs de la classe User
    Scanner sc = new Scanner(System.in);
    String prenomUser;
    String nomUser;
    int ageUser;
    String villeUser;
    String messageTape;
    String[] messageTable = new String[10];
    int i_msg = 0;
    String[] listeAmi = new String[10];
    int i_ami = 0;

    // Contructeur sans parametres
    public User()
    {
        System.out.println("Création d'un utilisateur");
        prenomUser = "Inconnu";
        nomUser = "Inconnu";
        ageUser = 0;
        villeUser = "Inconnu";
    }

    // Contructeur avec 2 parametres
    public User(String pPrenom, String pNom)
    {
        System.out.println("Création d'un utilisateur avec 2 paramètres");
        prenomUser = pPrenom;
        nomUser = pNom;
    }

    // Contructeur avec 4 parametres
    public User(String pPrenom, String pNom, int pAge, String pVille)
    {
        System.out.println("Création d'un utilisateur avec plusieurs paramètres");
        prenomUser = pPrenom;
        nomUser = pNom;
        ageUser = pAge;
        villeUser = pVille;
    }

    // Getter et Setter pour les attributs
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

    // Liste des methodes utilisées

    public void modifyInfo() {
        System.out.println("Ton prénom :");
        this.prenomUser = sc.nextLine();
        System.out.println("Ton nom :");
        this.nomUser = sc.nextLine();
        System.out.println("Ton age :");
        this.ageUser = sc.nextInt();
        sc.nextLine();
        System.out.println("Ta ville :");
        this.villeUser = sc.nextLine();
    }

    public void writeMsg()
    {
        System.out.println("Votre message : ");
        this.messageTape = sc.nextLine();

        messageTable[this.i_msg] = this.messageTape;
        this.i_msg++;
        this.i_msg = this.i_msg%10;
    }

    public void showAllMsg()
    {
        System.out.println("Liste des messages : ");
        for(int j = 0; j < messageTable.length; j++)
        {
            if(messageTable[j] != null)
            {
                System.out.println(j+1 + " : " + messageTable[j]);
            }
        }
    }

    public void showInfo()
    {
        System.out.println("Vos information de profil : \n" +
                            "Votre prénom : " + this.prenomUser + "\n" +
                            "Votre nom : " + this.nomUser + "\n" +
                            "Votre age : " + this.ageUser + "\n" +
                            "Votre ville : " + this.villeUser + "\n");
    }

    public void addFriend()
    {
        System.out.println("Indiquez le prénom et le nom de votre ami : ");
        listeAmi[this.i_ami] = sc.nextLine();
        this.i_ami++;
        this.i_ami = this.i_ami%10;
    }

    public void showFriend()
    {
        System.out.println("La liste de vos amis : ");
        for(int f = 0; f < listeAmi.length; f++)
        {
            if(listeAmi[f] != null)
            {
                System.out.println(f+1 + " : " + listeAmi[f]);
            }
        }
    }
}
