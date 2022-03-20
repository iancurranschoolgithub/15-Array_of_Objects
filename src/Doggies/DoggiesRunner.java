package Doggies;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import MonsterMash.Monster;

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner
{
   public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);

		for(int i=0; i<size;i++)
		{
			{
				System.out.print("Doggie age: ");
				int age = keyboard.nextInt();
				System.out.println();
				System.out.print("Doggie name: ");
				String name = keyboard.next();
				System.out.println();
				pack.set(i, age, name);
			}
			//read in age and name of the dog
			
			//call the method to add a new dog to the pack
			
		}		
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());		
	}		
}