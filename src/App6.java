import java.io.*;	// ce package contient FileWriter

public class App6 {

	public static void main(String[] args) 
	{
		// tout le code E/S doit etre dans un try / catch
		try
		{
			FileWriter fw = new FileWriter("ressources\\App6.dat");
			
			// si le fichier n'existe pas, il sera cree
			fw.write("Bonjour Dominick");
			fw.write(";");
			fw.write("Ceci est un test pour ecrire du texte dans un fichier");
			fw.write(";");
			fw.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}