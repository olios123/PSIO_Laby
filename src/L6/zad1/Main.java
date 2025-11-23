package L6.zad1;

import L6.zad1.languages.*;

public class Main {
	public static void main(String[] args)
	{
		ProgrammingLanguage java = new JavaLanguage();
		ProgrammingLanguage python = new PythonLanguage();
		ProgrammingLanguage haskell = new HaskellLanguage();

		LanguageTester tester = new LanguageTester();
		tester.addLanguage(java);
		tester.addLanguage(python);
		tester.addLanguage(haskell);

		tester.print();

		tester.sort();

		tester.print();
	}
}
