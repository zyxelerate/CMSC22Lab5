public class Date{
	
	private int year = 1000;
	private int month = 1;
	private int day = 1;

	public Date(){ //default values
		setDate(year, month, day);
	}

	public Date(int year, int month, int day){
		setDate(year, month, day);
	}

	public int getYear(){
		return year;
	}

	public int getMonth(){
		return month;
	}

	public int getDay(){
		return day;
	}

	public void setYear(int year){
		//error checking
		if (!(year >= 1000 && year <= 9999)){
			throw new IllegalArgumentException("Year not valid");
		}
		this.year = year;
	}

	public void setMonth(int month){
		//error checking
		if (!(month >= 1 && month <= 12)){
			throw new IllegalArgumentException("Month not valid");
		}
		this.month = month;
	}

	public void setDay(int day){
		//check if entered date is on february and is a leap year
		if (this.month == 2 && this.year % 4 == 0 && (day < 1 || day > 29)){
			throw new IllegalArgumentException("February has only 29 days on leap years!!!");
		}
		//check if entered date is on february and not a leap year
		else if (this.month == 2 && this.year % 4 != 0 && (day < 1 || day > 28)){
			throw new IllegalArgumentException("February has only 28 days!!!");
		}
		//check if month has 30 days
		else if ((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && (day < 1 || day > 30)){
			throw new IllegalArgumentException("These months only have 30 days!!!");
		}
		//check if input is valid
		else if (day < 1 || day > 31){
			throw new IllegalArgumentException("Day not valid!!!");
		}
		this.day = day;
	}

	public String toString(){
		return String.format("%02d / %02d / %04d", this.month, this.day, this.year);
	}

	public void setDate(int year, int month, int day){
		setYear(year);
		setMonth(month);
		setDay(day);
	}
}