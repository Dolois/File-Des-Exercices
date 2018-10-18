import java.io.File;
import java.util.Arrays;

public class App3 
{
	public static void main(String[] args) 
	{
		// liste des éléments racine du système de fichier courant 
		File [] roots = File.listRoots();
		
		// affichage du tableau résultat System.out.println(Arrays.toString(roots));
		System.out.println(Arrays.toString(roots));
		// [C:\, D:\, E:\, F:\, G:\]
	}
}