package L6.zad2;

public abstract class Programmer {
	private String specialization;

	public Programmer(String specialization)
	{
		this.specialization = specialization;
	}

	public abstract String writeCode();
	public abstract String favouriteLanguage();

	public void introduce()
	{
		System.out.println("specialization: " + specialization + " | writeCode: " + writeCode() + " | favouriteLanguage: " + favouriteLanguage());
	}
}
