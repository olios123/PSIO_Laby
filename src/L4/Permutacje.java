package L4;

public class Permutacje {
	public static void main(String[] args)
	{
		String[] l = new String[]{"1", "2", "3"};

		String[][] per = permutacje(l);

		for (int i = 0; i < per[i].length; i++)
		{
			for (int j = 0; j < per[i][j].length(); j++)
			{
				System.out.print(per[i][j]);
			}
		}
	}

	public static String[][] permutacje(String[] list)
	{
		String[][] result = new String[6][list.length];

		for (int i = 0; i < 1; i++)
		{
			String[] tab = new String[list.length];
			tab[i] = list[0];

			result[i] = tab;
		}

		return result;
	}

}
