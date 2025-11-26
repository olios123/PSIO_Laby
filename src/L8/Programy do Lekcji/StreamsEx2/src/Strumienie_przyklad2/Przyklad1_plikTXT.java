import java.io.*;

public class Przyklad1_plikTXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String wiersz_tekstu = null;
		String [] tokeny;
		
		File plik = new File("Pan Tadeusz.txt");
		
		//wykorzystanie 'try-with-resources statement'
		try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
			
			/*Odczytujemy każdy wiersz pliku TXT, następnie dzielmy go 
			według listy separatorów podanych do metody split(...)*/		
			while( (wiersz_tekstu = breader.readLine() ) != null ) 
			{
				tokeny = wiersz_tekstu.split("[, ?.@!:();]"); //[ zbiór separatorów ]
				
				for(int i = 0; i<tokeny.length; i++)
					System.out.println(tokeny[i]);
		
				Thread.sleep(10); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
