package MonsterMash;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot] = m;
	}

	public Monster getLargest( )
	{
		Monster temp = myMonsters[0];
		for (int i = 0; i < myMonsters.length; i++) {
			if (myMonsters[i].isBigger(temp.getHeight()))
				temp = myMonsters[i];
		}
		return temp;
	}

	public Monster getSmallest( )
	{
		Monster emp = myMonsters[0];
		for (int j = 0; j < myMonsters.length; j++) {
			if (myMonsters[j].isSmaller(emp.getHeight()))
				emp = myMonsters[j];
		}
		return emp;
	}

	public String toString()
	{
		return "" + Arrays.toString(myMonsters);
	}
}