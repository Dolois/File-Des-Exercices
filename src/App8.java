import java.io.*;
import java.nio.*;
import java.util.*;

public class App8 
{

	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream in_flot  = new FileInputStream("src\\App6.java");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			FileOutputStream out_flot = new FileOutputStream("ressources\\App6.out");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		byte b;
		
		while ((b = (byte) in_flot.read()) != -1)
		{
			out_flot.write(b);
		}
		
		in_flot.close();
		out_flot.close();
	}
}
