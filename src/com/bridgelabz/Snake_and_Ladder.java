package com.bridgelabz;

public class Snake_and_Ladder {
	public static void main(String[] args) 
	{
		int i= 0;
		int noPlay= 0;
		int ladder= 1;
		int snake= 2;
        int count= 0;
         
	while(i<=100)
			{
	            count=count+1;
				int roll = (int ) Math.floor((Math.random() * 10) % 3);
				int value = (int) Math.floor((Math.random() * 10) % 6)+1;
				System.out.println("Dice Roll =" + value);
				
				//logic
				if(roll == noPlay) 
				{
					System.out.println("No Play" + i);
					System.out.println("counter" + count);
					
				}
				else if (roll == ladder) 
				{
					     i=i+value;
				         if(i == 100)
			         	{
				     	i=100;
					     System.out.println("Ladder" +i);
					     System.out.println("counter" + count);
				        }
			         	else
			         	{
					    System.out.println("Ladder" + i);
					    System.out.println("counter" + count);
			         	}
				}
	    	   else 
	    	   {
				     i=i-value;
				     if(i<0)
				     {
				     i=0;
					       System.out.println("snake" + i);
					       System.out.println("counter" + count);
				     }
				     else
				     {
				    	System.out.println("snake" + i);
				    	System.out.println("counter" + count);
				     }
	    	   }
			}

	}
}
