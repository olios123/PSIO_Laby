package L6.zad2.languages;

import L6.zad2.Programmer;

public class DataScientist extends Programmer {
	public DataScientist()
	{
		super("data scientist");
	}

	@Override
	public String writeCode() {
		return "database";
	}

	@Override
	public String favouriteLanguage() {
		return "python";
	}
}
