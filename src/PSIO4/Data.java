package PSIO4;

import java.lang.reflect.Array;

public class Data {

	int day;
	int month;
	int year;

	public Data() {
		day = 1;
		month = 1;
		year = 1970;
	}
	public Data(int year)
	{
		day = 1;
		month = 1;
		this.year = year;
	}
	public Data(int day, int month)
	{
		this.month = month;
		this.day = day;
		this.year = 1970;
	}
	public Data(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// -----------
	// Get
	// -----------

	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}

	public String toString()
	{
		return day+"."+month+"."+year;
	}

	// -----------
	// Set
	// -----------

	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}

	// -----------
	// Manipulation
	// -----------

	public void setData(String data)
	{
		String[] d = data.split("\\.");
		this.day = Integer.parseInt(d[0]);
		this.month = Integer.parseInt(d[1]);
		this.year = Integer.parseInt(d[2]);
	}

	// -----------
	// Checking
	// -----------

	// Checking if provided year is leaped
	public boolean isLeapYear()
	{
		return this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0);
	}

	// Checking if provided date is correct
	public boolean isCorrectDate()
	{
		// Checking days
		// Too much or too fewer days in month
		if (this.day <= 0 || this.day > 31) return false;

		switch (this.month)
		{
			case 2:
				if (isLeapYear() && this.day > 29) return false;
				if (!isLeapYear() && this.day > 28) return false;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				if (this.day > 30) return false;
				break;

			default:
				System.out.println("Invalid month!");
				return false;

		}

		// Checking months
		if (this.month <= 0 || this.month > 12) return false;

		// Everything ok
		return true;
	}

	// How many days in current month
	public int howManyDays()
	{
		int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear()) days[1] = 29;

		if (this.month > 0 && this.month <= 12)
			return days[this.month - 1];

		System.out.println("Invalid month!");
		return -1;
	}

	// How many days has been passed since start of the year
	public int dayOfYear()
	{
		int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear()) days[1] = 29;

		int dayYear = 0;

		for (int i = 0; i < this.month; i++)
		{
			dayYear += days[i];
		}
		dayYear += this.day;

		return dayYear;
	}

    // What date is earlier
	public int compareDate(Data d1, Data d2)
	{
		//  -1   left date is earlier
		//   0   dates are equal
		//   1   right date is earlier

		// Equal
		if (d1.day == d2.day && d1.month == d2.month && d1.year == d2.year) return 0;

		if (d1.year > d2.year) return 1;
		else if (d1.year < d2.year) return -1;
		else // Equal
		{
			if (d1.month > d2.month) return 1;
			else if (d1.month < d2.month) return -1;
			else // Equal
			{
				if (d1.day > d2.day) return 1;
				return -1;
			}
		}
	}

	// Returning how many days are in the current year
	public int daysInTheYear()
	{
		if (isLeapYear()) return 366;
		else return 365;
	}
}
