package L6.zad2;

import java.util.ArrayList;
import java.util.List;

public class Hackathon {

	private List<Programmer> list;

	public Hackathon()
	{
		list = new ArrayList<>();
	}

	public void add(Programmer programmer)
	{
		list.add(programmer);
	}

	public void code()
	{
		for (Programmer pr : list)
			System.out.println(pr.writeCode());
	}

}
