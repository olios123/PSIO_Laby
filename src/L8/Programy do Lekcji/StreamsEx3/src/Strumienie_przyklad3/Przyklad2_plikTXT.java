import java.io.*;
import java.util.Scanner;

public class Przyklad2_plikTXT {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		File plik = new File("Pan Tadeusz.txt");
		
		/*wykorzystanie 'try-with-resources statement' oraz
		opakowanie Bufora BufferedReader Scanner-em
		(możliwość wykorzystania metod klasy Scanner na danych tekstowych)*/
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader(plik))))
		{			
			while( scan.hasNext() ) 
			{			
				System.out.println(scan.next());
					
				Thread.sleep(10);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
}