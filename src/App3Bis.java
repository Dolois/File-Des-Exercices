import java.io.*;

public class App3Bis {

	public static void main(String[] args) 
	{
		File f = new File(System.getProperty("user.dir") + "\\ressources\\App3Bis.dat");
		
		// controle si le fichier est existant
		// 	retourne true si le fichier est existant
		// 	retourne false si le fichier est inexistant et cree le fichier
		try 
		{
			boolean bool;
			bool = f.createNewFile();
			
			if (!bool)	// si false
			{
				System.out.println("Le fichier existe déjà");
			}
			else
			{
				System.out.println("Le fichier est bien créé");
			}
			
			// if (f.exists())
			// {
			//	System.out.println("Le fichier existe déjà");
			// }
			
			// creer une instance rep de la classe File
			File rep = new File("images");
			
			// Crer un repertoire images
			rep.mkdir();
			
			if (rep.isDirectory())
			{
				// Afficher le nom du repertoire
				System.out.println("\\" + rep);
				
				// Tableau de(s) fichier(s) du repertoire
				String [] contenuRep = rep.list();
				
				// Afficher le contenu du repertoire
				for (int i = 0; i < contenuRep.length; i++)
				{
					System.out.println(contenuRep[i]);
				}
			}

			// Deplacer le fichier App3Bis.dat dans le repertoire images
			// et peut etre renommer
			f.renameTo(new File(System.getProperty("user.dir") + "\\images\\App3Bis.dat"));
			
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
