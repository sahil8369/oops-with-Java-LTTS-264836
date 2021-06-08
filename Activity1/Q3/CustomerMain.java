import java.util.Scanner;

class CustomerMain {

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
	     Customer cust1=new Customer();
	     
	     System.out.println("Enter the details:");
	     String input= scan.nextLine();
	     String[] arrOfinput = input.split(",");
	     
	     cust1.setName(arrOfinput[0]);
	     cust1.setAddress(arrOfinput[1]);
	     cust1.setMobile(arrOfinput[2]);
	     
	     System.out.println("Name: "+cust1.getName());
	     System.out.println("Address: "+cust1.getAddress());
	     System.out.println("Mobile: "+cust1.getMobile());
	     
	}

}

class Customer 
{
	  private String name;
	  private String address;
	  private String mobile;

	   public String getName() 
	   {
		   return name;
	   }
	   public String getAddress() 
	   {
		   return address;
	   }
	   public String getMobile() 
	   {
	       return mobile;
	   }

	   public void setName(String newName) 
	   {
	     this.name = newName;
	   }
	   public void setAddress(String newAddress) 
	   {	
		 this.address = newAddress;
	   }
	   public void setMobile(String newMobile) 
	   {
	     this.mobile = newMobile;
	   }

}