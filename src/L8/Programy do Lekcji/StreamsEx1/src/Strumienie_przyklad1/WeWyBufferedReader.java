import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class WeWyBufferedReader {

	
	public static void main(String[] args) {

	      
		/*W tym przykładzie: opakowanie std. we/wy do większego bufora - można, bo zachowujemy 
		standard pracy na strumieniach, ale... nie trzeba, scanner sobie poradzi 
		(jest do tego celu wystarczająco duży i ma ciekawe metody) ...*/

		BufferedReader reader = null;		 
		BufferedWriter outB = null;
		 
		String wiersz = "";
	     
		try 
		{		
			reader = new BufferedReader(new InputStreamReader(System.in));
			outB = new BufferedWriter(new OutputStreamWriter(System.out));
			
			while (!wiersz.equals("koniec")) 
			{	    
				wiersz= reader.readLine();
				outB.write(wiersz + "\n");
			}
			
			/* flush() - wyślij do strumienia wszystko 
			co znajduje się w Buforze - tak wyświetlamy zawartość bufora*/

			outB.flush();	
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			//Zamykamy strumienie
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				outB.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
