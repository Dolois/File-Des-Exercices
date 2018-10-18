public class App1 {

    public static void main (String[] args) 
    {
    	// Afficher le répertoire courant 
    	// a partir d'une propriete systeme
    	// de la machine java
        System.out.println(System.getProperty("user.dir")) ;
        // F:\Eclipse\workspace\TestFileClass
        
        // Creer un objet toto de la Classe Employe
        Employe toto  = new Employe();
        
        // Creer un objet toto1 de la Classe Employe
        Employe toto1 = new Employe("Dominick");
        
        // Creer un objet toto2 de la Classe Employe
        Employe toto2 = new Employe("Dominick","Loisel");
        
        // Afficher le répertoire des fichiers temporaires
    	// a partir d'une propriete systeme
    	// de la machine java
        System.out.println(System.getProperty("java.io.tmpdir"));
        // C:\Users\Dominick\AppData\Local\Temp\
    }
}
