import java.util.Scanner;
class Vehicle
{
    private String make;
    private String vehicleNumber;
    private String fuelType;
    private int fuelCapacity;
    private int cc;

    public String getMake() 
	{
        return make;
    }
    public void setMake(String make) 
	{
        this.make = make;
    }
    public String getVehicleNumber() 
	{
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) 
	{
        this.vehicleNumber = vehicleNumber;
    }
    public String getFuelType() 
	{
        return fuelType;
    }
    public void setFuelType(String fuelType) 
	{
        this.fuelType = fuelType;
    }
    public int getFuelCapacity() 
	{
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) 
	{
        this.fuelCapacity = fuelCapacity;
    }
    public int getCc() 
	{
        return cc;
    }
    public void setCc(int cc) 
	{
        this.cc = cc;
    }

public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
{
    this.make = make;
    this.vehicleNumber = vehicleNumber;
    this.fuelType = fuelType;
    this.fuelCapacity = fuelCapacity;
    this.cc = cc;
}
public void displayMake()
{
    System.out.println("***"+make+"***");
}
public void displayBasicInfo()
{
    System.out.println("---Basic Information---");
    System.out.println("Vehicle Number:"+vehicleNumber);
    System.out.println("Fuel Capacity:"+fuelCapacity);
    System.out.println("Fuel Type:"+fuelType);
    System.out.println("Engine CC:"+cc);
}
public void displayDetailInfo()
	{
	}
}

class TwoWheeler extends Vehicle
{
    private boolean kickStartAvailable;
    public boolean isKickStartAvailable() 
	{
        return kickStartAvailable;
    }
    public void setKickStartAvailable(boolean kickStartAvailable) 
	{
        this.kickStartAvailable = kickStartAvailable;
    }
    public TwoWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,boolean kickStartAvailable)
	{
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.kickStartAvailable = kickStartAvailable;
    }
    public void displayDetailInfo()
	{
        System.out.println("---Detail Information---");
        if(kickStartAvailable)
        System.out.println("Kick Start Available: YES");
        else
        System.out.println("Kick Start Available: NO");
    }
}

class FourWheeler extends Vehicle
{
    private String audioSystem;
    private int numbersOfDoors;

    public String getAudioSystem() 
	{
        return audioSystem;
    }
    public void setAudioSystem(String audioSystem) 
	{
        this.audioSystem = audioSystem;
    }
    public int getNumbersOfDoors() 
	{
        return numbersOfDoors;
    }
    public void setNumbersOfDoors(int numbersOfDoors) 
	{
        this.numbersOfDoors = numbersOfDoors;
    }

    public FourWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,String audioSystem,int numberOfDoors)
	{
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem = audioSystem;
        this.numbersOfDoors = numberOfDoors;
    }
    
    public void displayDetailInfo()
	{
        System.out.println("---Detail Information---");
        System.out.println("Audio System: "+audioSystem);
        System.out.println("Numbers of Doors: "+numbersOfDoors);
    }
}

class VehicleTest 
{
    
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Four Wheeler");
        System.out.println("2. Two Wheeler");
        System.out.println("Enter Vehicle Type:");
        String op = sc.nextLine();
        if(op.equals("1")||op.equals("2"))
		{
            System.out.println("Vehicle Make:");
            String vMake = sc.nextLine();
            System.out.println("Vehicle Number:");
            String vNum = sc.nextLine();
            System.out.println("Fuel Type:");
            System.out.println("1.Petrol");
            System.out.println("2.Diesel");
            String fTypeOp = sc.nextLine();
            String fType;
            if(fTypeOp.equals("1"))
           	{
					fType = new String("Petrol");
			}
            else
			{
                fType = new String("Diesel");
            }
			System.out.println("Fuel Capacity:");
            int fCap=sc.nextInt();
            System.out.println("Engine Capacity");
            int eCap=sc.nextInt();
            sc.nextLine();
            if(op.equals("1"))
			{
                FourWheeler f = new FourWheeler(vMake,vNum,fType,fCap,eCap,"",0);
                System.out.println("Audio System:");
                f.setAudioSystem(sc.nextLine());
                System.out.println("Number of Doors:");
                f.setNumbersOfDoors(sc.nextInt());
                f.displayMake();
                f.displayBasicInfo();
                f.displayDetailInfo();
            }
            else
			{
                TwoWheeler t = new TwoWheeler(vMake,vNum,fType,fCap,eCap,true);
                System.out.println("Kick Start Available(true/false):");
                t.setKickStartAvailable(sc.nextBoolean());
                t.displayMake();
                t.displayBasicInfo();
                t.displayDetailInfo();
            }
        }
    }    
}