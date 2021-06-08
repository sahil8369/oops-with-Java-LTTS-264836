import java.util.*;

class InningsMain {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    Innings inn1=new Innings();
	     
	    System.out.println("Enter the team name:");
	    String teamname = scan.next();
	    inn1.setTeamname(teamname);
	     
	    System.out.println("Enter session:");
	    String inningsname = scan.next();
        inn1.setInningsname(inningsname);
	    
	    System.out.println("Enter runs:");
	    int runs = scan.nextInt();
	    if(runs<0) 
		{
			System.out.println("invalid output");
	    }
		inn1.setRuns(runs);
	    inn1.displayInningsDetails();
	}

}
class Innings 
{
	private String teamname ;
    private	String inningsname ;
	private int runs;
	   public String getTeamname() 
	   {
			return teamname;
	   }
	   public String getInningsname() 
	   {
		    return inningsname;
	   }
	   public int getruns() 
	   { 
			return runs;
	   }
	   
	   public void setTeamname(String newTeamname) 
	   {
			this.teamname = newTeamname;
	   }
	   public void setInningsname(String newInningsname) 
	   {
			this.inningsname = newInningsname;
	   }
	   public void setRuns(int newRuns) 
	   { 
			this.runs = newRuns;
	   }
	   
	   public void displayInningsDetails() 
	   {
		   System.out.println("Name: "+this.teamname);
		   System.out.println("Scored: "+this.runs);
		   if(inningsname.equalsIgnoreCase("First")) 
		   {
			   System.out.println("Need "+(this.runs+1)+" to win");
		   }
		   else if(inningsname.equalsIgnoreCase("Second")) 
		   {
			   System.out.println("Match Ended.");
		   }
		   else 
		   {
			   System.out.println("Incorrect Proper Innings name");
		   }
	   }
}
