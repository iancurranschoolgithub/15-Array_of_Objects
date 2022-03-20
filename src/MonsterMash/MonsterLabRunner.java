package MonsterMash;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			System.out.println("Monster height: ");
			int height = keyboard.nextInt();
			System.out.println("Monster weight: ");
			int weight = keyboard.nextInt();
			System.out.println("Monster age: ");
			int age = keyboard.nextInt();
			herd.add( i, new Monster(height, weight, age));
			//instantiate a new Monster() and add it to the herd			
			
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		System.out.println("SMALLEST :: "+herd.getSmallest()+"\n");
	    System.out.println("LARGEST :: "+herd.getLargest()+"\n");
		//print out the other stats

   }
}