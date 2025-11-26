package L8.m;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		FilesManager filesManager = new FilesManager("./src/L8/m/plik.txt");

		filesManager.write("Linia nr.1 \n");
		filesManager.write("Linia nr2.");

		System.out.println(Arrays.toString(filesManager.readFile().toArray()));
		System.out.println(filesManager.readLine());
		System.out.println(filesManager.readLine());
		System.out.println(filesManager.readLine());

//		FilesManager filesManager = new FilesManager("./src/L8/m/students.ser");
//
//		Student student1 = new Student("Jan", "Kowalski", 20);
//		Student student2 = new Student("Anna" , "Nowak", 22);
//
////		filesManager.write(student1);
////		filesManager.write(student2);
//
//		Student deserializedStudent1 = (Student) filesManager.readObject();
//
//		System.out.println(deserializedStudent1.toString());


	}
}
