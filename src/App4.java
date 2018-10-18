import java.io.File;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) 
	{			
		// Creer une instance rep de la classe File 
		File rep = new File("ressources");
		
		// Creer un repertoire
		rep.mkdir();

		// Creer un objet representant un fichier existant
		File f = new File("ressources\\App4.dat");
		
		if (!f.exists())
		{
			try 
			{
				f.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}		

		// Lister le contenu d'un repertoire
		if (rep.isDirectory())
		{
			// tableau de String contenant tous les fichiers du repertoire
			String [] ContenuRep = rep.list();
			
			for (int i = 0; i < ContenuRep.length; i++)
			{
				System.out.println(ContenuRep[i]);
				// App4.dat
				// App6.dat
				// MonZoo.dat
			}
		}
		
		// Obtenir le chemin absolu d'un fichier ou d'un repertoire
		System.out.println(rep.getAbsolutePath());
		// F:\Eclipse\workspace\TestFileClass\ressources
		
		// Supprimer un fichier ou un repertoire
		// boolean supprime = rep.delete();
	}
}