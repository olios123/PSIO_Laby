package L6.zad2;

import L6.zad2.languages.BackendDeveloper;
import L6.zad2.languages.DataScientist;
import L6.zad2.languages.FrontendDeveloper;

public class Main {
	public static void main(String[] args)
	{
		Programmer frontend = new FrontendDeveloper();
		Programmer backend = new BackendDeveloper();
		Programmer data = new DataScientist();

		Hackathon hackathon = new Hackathon();
		hackathon.add(frontend);
		hackathon.add(backend);
		hackathon.add(data);

		hackathon.code();
	}
}
