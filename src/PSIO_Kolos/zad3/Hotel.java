package PSIO_Kolos.zad3;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	public Pokoj[] rooms;

	public Hotel(int numberOfRooms) {
		rooms = new Pokoj[numberOfRooms];

		for (int i = 1; i <= numberOfRooms; i++) {
			Pokoj room = new Pokoj(i);
			rooms[i - 1] = room;
		}
	}

	public Pokoj[] getRooms() {
		return rooms;
	}

	public boolean findFreeRoom() {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].getClient() == null) {
				System.out.println("Znaleziono wolny pokój o numerze " + rooms[i].getNumber());
				return true;
			}
		}
		System.out.println("Wszystkie pokoje są zajęte!");
		return false;
	}

	public void rentRoom(int roomNumber, Osoba osoba) {
		for (int i = 0; i < rooms.length; i++) {
			Pokoj room = rooms[i];
			if (room.getNumber() == roomNumber) {
				if (room.getClient() != null) {
					System.out.println("Ten pokój został już wynajęty!");
					return;
				}
				System.out.println("Wynajęto pokój nr " + roomNumber);
				rooms[i].setClient(osoba);
				return;
			}
		}
		System.out.println("Nie znaleziono pokoju opodanym numerze!");
	}

	public int[] whatRoomRentsPerson(Osoba osoba) {
		List<Integer> roomNumbers = new ArrayList<>();

		for (Pokoj room : rooms) {
			if (room.getClient().equals(osoba)) {
				roomNumbers.add(room.getNumber());
			}
		}

		int[] roomsArray = new int[roomNumbers.size()];
		for (int i = 0; i < roomNumbers.size(); i++)
			roomsArray[i] = roomNumbers.get(i);

		return roomsArray;
	}

	public void releaseRentedRoom(Osoba osoba) {
		int rentedRooms = 0;
		for (Pokoj room : rooms) {
			if (room.getClient().equals(osoba)) {
				room.setClient(null);
				System.out.println("Zwolniono pokój nr: " + room.getNumber());
				rentedRooms++;
			}
		}
		System.out.println("Zwolniono " + rentedRooms + " pokoi.");
	}




}
