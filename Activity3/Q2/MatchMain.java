import java.util.*;
abstract class Match 
{
	private int currentScore; 
	private float currentOver;
	private int Target;
	
	public int getcurrentScore() 
	{
		return currentScore;
	}
	
	public float getcurrentOver() 
	{
		return currentOver;
	}
	public int getTarget() 
	{
		return Target;
	}
	
	public void setcurrentScore(int newCs) 
	{
	     this.currentScore = newCs;
    }
	public void setcurrentOver(float newCo) 
	{
	     this.currentOver = newCo;
    }
	public void setTarget(int newT) 
	{
	     this.Target = newT;
    }
	
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate,int balls);
}

class MatchMain
{

	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the Match format");
		System.out.println("1.ODI\n 2.T20\n 3.Test\n  ");
		  int choice=s.nextInt();
		     
	    	 switch(choice)
	    	 {
	    	 case 1: 
					Match mat1=new ODIMatch();
	    		    System.out.println("Enter the Current Score");
	    	          int currentScore=s.nextInt();
	    	          mat1.setcurrentScore(currentScore);
	    	          System.out.println("Enter the Current over");
	    	          float currentover=s.nextFloat();
	    	          mat1.setcurrentOver(currentover);
	    	          System.out.println("Enter the Target score");
	    	          int target=s.nextInt();
	    	          mat1.setTarget(target);
	    	          
	    	          System.out.println("Requirements:");
	    	          double reqRunrate=mat1.calculateRunRate();
	    	          int balls=mat1.calculateBalls();
	    	          mat1.display(reqRunrate,balls);
	    	          break;
	    	          
	    	 case 2: 
			      Match mat3=new T20Match();
	  	          System.out.println("Enter the Current Score");
					  int currentScore3=s.nextInt();
					  mat3.setcurrentScore(currentScore3);
					  System.out.println("Enter the Current over");
					  float currentover3=s.nextFloat();
					  mat3.setcurrentOver(currentover3);
					  System.out.println("Enter the Target score");
					  int target3=s.nextInt();
					  mat3.setTarget(target3);
					  
					  System.out.println("Requirements:");
					  double reqRunrate3=mat3.calculateRunRate();
					  int balls3=mat3.calculateBalls();
					  mat3.display(reqRunrate3,balls3);
					  break;
	  
	
         	case 3: 
			     Match mat2=new TestMatch();
	             System.out.println("Enter the Current Score");
					int currentScore2=s.nextInt();
					mat2.setcurrentScore(currentScore2);
					System.out.println("Enter the Current over");
					float currentover2=s.nextFloat();
					mat2.setcurrentOver(currentover2);
					System.out.println("Enter the Target score");
					int target2=s.nextInt();
					mat2.setTarget(target2);
					
					System.out.println("Requirements:");
					double reqRunrate2=mat2.calculateRunRate();
					int balls2=mat2.calculateBalls();
					mat2.display(reqRunrate2,balls2);
					break;
					
	
			}
	}
}
class  ODIMatch extends Match
{
	float overs=(float) 50.0;
	float calculateRunRate() 
	{
		
		return (getTarget()-getcurrentScore())/(overs-getcurrentOver());	
	}
	int calculateBalls() 
	{
		return (int) ((overs-getcurrentOver())*6);
	}
	void display(double reqRunrate,int balls) 
	{
		int Reqruns=getTarget()-getcurrentScore();
		System.out.println("Need " +Reqruns+" Runs in "+calculateBalls()+" Balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}
class T20Match extends Match
{
	float overs=(float) 20.0;
    float calculateRunRate() 
	{
		
		return (getTarget()-getcurrentScore())/(overs-getcurrentOver());	
	}
	int calculateBalls() 
	{
		return (int) ((overs-getcurrentOver())*6);
	}
	void display(double reqRunrate,int balls) 
	{
		int Reqruns=getTarget()-getcurrentScore();
		System.out.println("Need " +Reqruns+" Runs in "+calculateBalls()+" Balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}

class TestMatch extends Match
{
	float overs=(float) 90.0;
    float calculateRunRate() 
	{	
		return (getTarget()-getcurrentScore())/(overs-getcurrentOver());	
	}
	int calculateBalls() 
	{
		return (int) ((overs-getcurrentOver())*6);
	}
	void display(double reqRunrate,int balls) 
	{
		int Reqruns=getTarget()-getcurrentScore();
		System.out.println("Need " +Reqruns+" Runs in "+calculateBalls()+" Balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}