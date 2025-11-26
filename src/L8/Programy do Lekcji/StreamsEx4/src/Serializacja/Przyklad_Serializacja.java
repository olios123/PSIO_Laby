import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Serializacja / Deserializacja:
Zapis i odczyt stanu obiektów do / i z dysku
To, co zapisujemy i następnie odczytujemy, to dane dotyczące trzech studentów:
Imię, Nazwisko, i Średnia (składowa klasy zawieranej - Raport)*/



class Raport implements Serializable {

	/* Wprowadzenie numeru wersji klasy w trakcie serializacji zagwarantuje, że jeśli klasa się zmieni (np. zostanie dodana składowa),
	to deserializacja danych z poprzedniej wersji klasy i tak się wykona (nie zostanie zgłoszony wyjątek) 
	Wersja klasy czy jest modyfikowana, czy też nie, jest teraz oznaczona unikatowym numerem, który jest stały.*/

	//private static final long serialVersionUID = 3895670990255762290L;
	private double Srednia = 0.0;
	
	public Raport(double srednia) {
		this.Srednia = srednia;
	}
	
	
	public double getSrednia() {
		return Srednia;
	}
	public void setSrednia(double srednia) {
		Srednia = srednia;
	}
	
}

class Student implements Serializable {

/*
Wprowadzenie numeru wersji klasy w trakcie serializacji zagwarantuje, że jeśli klasa się zmieni (np. zostanie dodana składowa),
to deserializacja danych z poprzedniej wersji klasy i tak się wykona (nie zostanie zgłoszony wyjątek) 
Wersja klasy czy jest modyfikowana, czy też nie, jest teraz oznaczona unikatowym numerem, który jest stały.*/

	//private static final long serialVersionUID = 5567566049324461550L;
	private String Imie = null;
	private String Nazwisko = null;
	
	

	
	/*Jeśli nie chcesz, aby jakaś składowa została zapisana, 
	oznacz ją jako transient*/
	
	//transient private String Nazwisko = null;
		
	private int Id = 0;
	
	/*Zawieranie obiektu typu Raport 
	(każdy Student 'ma' raport)*/
	private Raport rp = null;
	
	
	public Student(String imie, String nazwisko, int Id, double srednia) {
		
		this.Imie = imie;
		this.Nazwisko = nazwisko;
		this.Id = Id;	
		
		this.rp = new Raport(srednia);
		
	}
	
	@Override
	public String toString() {
		if (rp!=null)
		 return this.Imie + "\t" +  this.Nazwisko + "\t" + (rp.getSrednia());
		else 
		 return this.Imie + "\t" +  this.Nazwisko;	
	} 
	
	
	public String getImie() {
		return Imie;
	}
	public void setImie(String imie) {
		Imie = imie;
	}
	public String getNazwisko() {
		return Nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}


public class Przyklad_Serializacja {

	private Student st1 = null;
	private Student st2 = null;
	private Student st3 = null;
	
	private static Student st11 = null,st22 = null,st33 = null;
	
	public Przyklad_Serializacja()
	{
		st1 = new Student("Tomasz", "Kowalski", 123, 4.5);
		st2 = new Student("Piotr", "Nowak", 345, 5.2);
		st3 = new Student("Piotr", "Kowalski", 567, 2.0);		
	}
		
	public static void main(String[] args) {
		
		Przyklad_Serializacja przyklad = new Przyklad_Serializacja();
		
		//Serializacja
		przyklad.zapisz();
		
		//Deserializacja
		przyklad.odczytaj();
		
		System.out.println(st11 + "\n" + st22 + "\n" + st33 + "\n");
	}
		
	public void zapisz() {
		
		try (ObjectOutputStream so = new ObjectOutputStream(new FileOutputStream("PlikStudentow.ser"))) 
		{			
			so.writeObject(st1);
			so.writeObject(st2);
			so.writeObject(st3);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		

	}
	
	public void odczytaj() {
		
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("PlikStudentow.ser"))) {
			
			Object obj1 = is.readObject();
			Object obj2 = is.readObject();
			Object obj3 = is.readObject();
			
			st11 = (Student) obj1;
			st22 = (Student) obj2;
			st33 = (Student) obj3;
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}		

}
