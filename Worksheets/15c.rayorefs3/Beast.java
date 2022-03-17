//(c) A+ Computer Science
//www.apluscompsci.com

//class complete worksheet key  

import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;

class Beast
{
	private String name;
	private int age;
	
	public Beast(String n, int a)
	{
		name=n;
		age=a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}

	public String toString()
	{
		return getName() + " - " + getAge();
	}
}