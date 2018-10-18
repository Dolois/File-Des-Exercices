import java.io.File;
import java.io.FileFilter;

public class App2
{
	public static void main(String[] args) 
	{
		String rep = "F:\\Eclipse\\workspace\\TestFileClass\\src\\";

		File repFile = new File(rep); 

		File [] fichiersJava = repFile.listFiles(new FileFilter() 
		{ 
			public boolean accept(File pathname) 
			{ 
				// on r�cup�re le nom de ce fichier ... 
				String fileName = pathname.getName();
			
				// ... et on teste s'il se termine par .java 
				return fileName.endsWith(".java"); 
			}
		});
		
		for(File path : fichiersJava)
		{
			System.out.println(path);
		}
	}
}