import java.io.*;
import java.lang.*;

public class App9 
{

	public static void main(String[] args) 
	{
		try 
		{
			FileReader e_file = new FileReader("src\\App6.java");
			
			FileWriter s_file = new FileWriter("ressources\\App6.dat");
			
			int b;
			
			while ( (b = (int) e_file.read()) != -1)
			{
				s_file.write(b);
			}
	
			e_file.close();
			s_file.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}