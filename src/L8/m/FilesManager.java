package L8.m;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class FilesManager {

	private File file;
	private int currentLine = 0;

	public FilesManager(String fileName) {
		file = new File(fileName);
	}

	public void write(String str) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

			bufferedWriter.write(str);

			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void write(Object object) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
			objectOutputStream.writeObject(object);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void writeLines(List<String> lines) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

			for (String line : lines) {
				bufferedWriter.write(line + "\n");
			}

			bufferedWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readLine() {
		String line = null;

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			for (int i = 0; i <= currentLine; i++) {
				line = bufferedReader.readLine();
			}
			currentLine++;

			bufferedReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return line;
	}
	public List<String> readFile()
	{
		List<String> lines = null;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			lines = bufferedReader.lines().toList();

			bufferedReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return lines;
	}
	public Object readObject()
	{
		Object object = null;
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
			object = objectInputStream.readObject();
			objectInputStream.close();
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return object;
	}

}
