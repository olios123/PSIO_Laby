package PSIO10.Buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Podaj wiersze:");
		String line;
		try {
			while ((line = bf.readLine()) != null) {
				System.out.println(line);

			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
