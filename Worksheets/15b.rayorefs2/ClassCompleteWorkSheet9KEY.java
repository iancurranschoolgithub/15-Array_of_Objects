//(c) A+ Computer Science
//www.apluscompsci.com

//class complete worksheet 9 key    

import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;

class Alligator
{
	private int length;
	private double hunger;
	
	public Alligator()
	{
		length=0;
		hunger=0.0;
	}
	
	public Alligator(int len, double hun)
	{
		length=len;
		hunger=hun;
	}
	
	public boolean equals(Object obj)
	{
	  Alligator param = (Alligator)obj;
	  return (length==param.length&&hunger==param.hunger);
	}
	
	public String toString()
	{
		return length + " " + hunger;
	}
}

public class ClassCompleteWorkSheet9KEY
{
   public static void main(String args[]) throws Exception
   {
			Alligator gator = new Alligator();
			Alligator gatuh = new Alligator(3,4);
			out.println("gator = " + gator);
			out.println("gatuh = " + gatuh);
			out.println(gator.equals(gatuh));
			Alligator mean = new Alligator(3,4);
			out.println(mean.equals(gatuh));			
   }
}