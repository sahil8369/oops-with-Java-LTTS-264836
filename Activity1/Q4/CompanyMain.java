import java.util.Scanner;

class CompanyMain 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    Company comp1=new Company();
	
		System.out.println("Enter the company name:");
	    String name= scan.nextLine();
	    comp1.setName(name);
	    
	    System.out.println("Enter the employees:");
	    String employees= scan.nextLine();
	    comp1.setEmployees(employees);
	    String[] arrOfemp=employees.split(",");
	    
	    System.out.println("Enter TeamLead:");
	    String teamlead= scan.next();
	    comp1.setTeamlead(teamlead);
	    
	    int team_member=0;
	    for(String emp:arrOfemp) 
		{
	    	if(teamlead.equals(emp))
			{
	    		team_member=1;
			}
		}
	    
	    if(team_member==1) 
		{
	    	System.out.println("Name: "+comp1.getName());
	    	System.out.println("Employees: "+comp1.getEmployees());
	    	System.out.println("Lead: "+comp1.getTeamlead());
	    }
	    else 
		{
	    	System.out.println("Invalid input.");
	    }
	    
	}

}

class Company 
{
	  private String name;
	  private String employees;
	  private String teamlead;
	  public String getName() 
	  {
	     return name;
	  }
	  
	  public String getEmployees() 
	  {
	     return employees;	  	
	  }
	  
	  public String getTeamlead() 
	  {
	     return teamlead;	 
	  }

	  public void setName(String newName) 
	  {
	     this.name = newName;
	  }
	  
	  public void setEmployees(String newEmployees) 
	  {
	     this.employees = newEmployees;
	  }
	  
	  public void setTeamlead(String newTeamlead) 
	  {
	     this.teamlead = newTeamlead;
	  }
}