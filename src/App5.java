import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App5 {

	public static void main(String[] args) 
	{
		// Creer un objet FileOutputStream 
		FileOutputStream fos = null;
		try 
		{
			// Creer le fichier s'il n'existe pas
			fos = new FileOutputStream("ressources\\MonZoo.dat");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		// Creer l'objet oos de la Classe ObjectOutputStream, 
		// il permet d'ecrire des objets mais il ne peut pas
		// se connecter directement au fichier. il a besoin d'un
		// intermediaire, ici un objet FileOutputStream. On va alors
		// chainer les dex flots, le ObjectOutputStream au FileOutputStream
		ObjectOutputStream oos = null;
		try 
		{
			oos = new ObjectOutputStream(fos);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		// Definir les objets a ecrire dans le fichier
		try 
		{
			oos.writeObject("Le Tigre\\ln");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			oos.writeObject("Le Lion\\ln");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			oos.writeObject("Le Jaguar\\ln");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			oos.writeObject("Le Puma\\ln");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			oos.writeObject("Le Guepard\\ln");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try {
			oos.writeObject("Le Lynx\\ln");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try {
			oos.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}