//© A+ Computer Science  -  www.apluscompsci.com

//class complete worksheet key  

import java.util.Arrays;

class Beasts
{
	private Beast[] things;
	
	public Beasts(int size)
	{
		things = new Beast[size];
	}
	
	public void set(int spot, Beast pet)
	{
		things[spot]=pet;
	}
	
	public String toString()
	{
		return Arrays.toString(things);
	}
}