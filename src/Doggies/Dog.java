package Doggies;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Dog 
{
    private int age;
    private String name;
    
    public Dog(int a, String n) 
    {
    	age = a;
    	name = n;
    } 
    	 
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }

    public boolean isOlder(int n) {
        boolean bb = n < age;
        return bb;
    }

    public boolean isYounger(int m) {
        boolean bs = m > age;
        return bs;
    }

    public String toString()
    {
    	return "" + age + " " + name;
    }  
}