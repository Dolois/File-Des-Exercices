import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// lire une ligne d'un fichier texte sur un site distant
public class App7 
{
	public static void main(String[] args) throws IOException, MalformedURLException
	{
		URL webURL = new URL("https://www.sample-videos.com/text/Sample-text-file-10kb.txt");

		BufferedReader line = new BufferedReader (new InputStreamReader(webURL.openStream()));

		String ligne = line.readLine();

		System.out.println(ligne);
	}
}
