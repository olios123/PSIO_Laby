package L6.zad2.languages;

import L6.zad2.Programmer;

public class BackendDeveloper extends Programmer {
	public BackendDeveloper()
	{
		super("backend");
	}

	@Override
	public String writeCode() {
		return "API";
	}

	@Override
	public String favouriteLanguage() {
		return "C++";
	}
}
