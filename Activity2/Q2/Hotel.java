import java.util.Scanner;

class HotelRoom
{
	String hotelName;
	int numberOfSqFeet;
	boolean hasTV;
	boolean hasWifi;
	
	public String getHotelName() 
	{
		return hotelName;
	}

	public void setHotelName(String hotelName) 
	{
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() 
	{
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) 
	{
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() 
	{
		return hasTV;
	}

	public void setHasTV(boolean hasTV) 
	{
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() 
	{
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) 
	{
		this.hasWifi = hasWifi;
	}

	public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
	{
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff()
	{
		return 0;
	}
	
}

class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;
	public int getRatePerSqFeet() 
	{
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) 
	{
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int ratePerSqFeet()
	{
		ratePerSqFeet=ratePerSqFeet+2;
		return ratePerSqFeet;
	}
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=10;
		if(hasWifi==true)
		{
			ratePerSqFeet();
		}
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
	}
}

class DeluxeACRoom extends DeluxeRoom
{

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=12;
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	
	public int getRatePerSqFeet() 
	{
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) 
	{
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
	}
}

class SuiteACRoom extends HotelRoom 
{
	private int ratePerSqFeet;
	public int getRatePerSqFeet() 
	{
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) 
	{
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=15;
		if(hasWifi==true)
		{
			ratePerSqFeet();
		}
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	public int ratePerSqFeet()
	{
		ratePerSqFeet=ratePerSqFeet+2;
		return ratePerSqFeet;
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;	
	}
	
}
public class Hotel 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room");
		System.out.println("Select Room Type:");
		int roomtype = input.nextInt();
		System.out.println("Hotel name:");
		String name = input.next();
		System.out.println("Room Square Feet Area:");
		int area = input.nextInt();
		System.out.println("Room has TV (yes/no):");
		String tv = input.next();
		System.out.println("Room has Wifi (yes/no):");
		String wifi = input.next();
		boolean t,w;
		if(tv.equalsIgnoreCase("yes")) 
		{
			 t=true;
		}
		else 
		{
			 t=false;
		}
		if(wifi.equalsIgnoreCase("yes")) 
		{
			 w=true;
		}
		else 
		{
			 w=false;
		}
		if(roomtype == 1)
		{
			DeluxeRoom dr = new DeluxeRoom(name,area,t,w);
		}
		else if(roomtype == 2)
		{
			DeluxeACRoom dr = new DeluxeACRoom(name,area,t,w);
		}
		else if(roomtype == 3)
		{
			SuiteACRoom dr = new SuiteACRoom(name,area,t,w);
		}
	}
}