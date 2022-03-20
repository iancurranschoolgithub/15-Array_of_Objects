package Doggies;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import MonsterMash.Monster;

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog (age, name);
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int old = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].isOlder(pups[old].getAge()))
					old = i;
			}
		return pups[old].getName();
	}

	public String getNameOfYoungest()
	{
		int old = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].isYounger(pups[old].getAge()))
				old = i;
		}
		return pups[old].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}