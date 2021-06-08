import java.util.*;
class EmployeeMain_5 
{

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
	     Employee emp1=new Employee();
	
		 System.out.println("Enter the name:");
	     String name = scan.next();
	     emp1.setName(name);
	     
	     System.out.println("Enter Address:");
	     String address = scan.next();
	     emp1.setAddress(address);
	  
	     System.out.println("Enter Mobile:");
	     String mobile = scan.next();
	     emp1.setMobile(mobile);
	     
	  
	     System.out.println("Employee Details\n Name: "+emp1.getName()+"\n Address: "+emp1.getAddress()+ "\n Mobile: "+emp1.getMobile());
	     System.out.println("Verify and Update the details:");
	     while(true)
	     {
		     System.out.println("Menu");
		     System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit");
		     int choice=scan.nextInt();
		     
	    	 switch(choice)
	    	 {
	    	 case 1: System.out.println("Current Employee name is : "+emp1.getName());
	    	         System.out.println("Enter New Employee name:");
	    	         name=scan.next();
	    	         emp1.setName(name);
	    	         break;
	    	 case 2: System.out.println("Current address is : "+emp1.getAddress());
	                 System.out.println("Enter the New address:");
	                 address=scan.next();
	                 emp1.setAddress(address);
	                 break;
	    	 case 3: System.out.println("Current mobile no is : "+emp1.getMobile());
                     System.out.println("Enter the New mobile no:");
                     mobile=scan.next();
                     emp1.setMobile(mobile);
                     break;
	    	 case 4: System.out.println("The details are:");
                     System.out.println("Name: "+emp1.getName());
                     System.out.println("Address: "+emp1.getAddress());
                     System.out.println("Mobile: "+emp1.getMobile());
                     return;
             default:System.out.println("Invalid choice");
	    	 }
	    	 
	     }
	     
	}

}
class Employee 
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