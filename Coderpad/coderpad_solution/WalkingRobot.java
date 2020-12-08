package com.coder.pad;

public class WalkingRobot 
{
	public static void main(String[] args) 
	{
	    String move= "UDDLLRUUUDUURUDDUULLDRRRR";
	    finalPosition(move);
	  }
	  static void finalPosition(String move)
	  {
	     char[] moves= move.toCharArray();
	     int upCount=0, downCount = 0,leftCount = 0,rightCount = 0;
	    
	    for(int i=0;i<moves.length;i++)
	    {
	        if(moves[i]=='U')
	        {
	          upCount++;
	        }
	        else if (moves[i]=='D')
	        {
	          downCount++;
	        }
	        else if(moves[i]=='R')
	        {
	          rightCount++;
	        }
	        else if(moves[i]=='L')
	        {
	          leftCount++;
	        }
	    }
	    // positive axis - negative axis
	    System.out.println( "Final Postion is ("+ (rightCount-leftCount) +","+ (upCount-downCount) +")"); 
	  }
}
