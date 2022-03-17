//(c) A+ Computer Science
//www.apluscompsci.com

//array of references worksheet key  

class Box
{
   private double size;
   
   public Box(double g)
   {
      size=g;
   }
   public String toString()
   {
      return ""+size;
   }
}


public class ArrayOfReferencesWorkSheet1KEY
{
	public static void main(String[] args)
	{

Box[] boxes = new Box[8];
boxes[0]= new Box(90.5);
boxes[2]= new Box(23.7);
boxes[4]= new Box(45.3);

String[] ray={"cba","abc","321","asd","246","985","wow"};




System.out.println(ray[0]);	            	// LINE 1


System.out.println(ray[0].charAt(0));		// LINE 2


System.out.println(ray[2]);				// LINE 3


System.out.println(ray[1]);				// LINE 4


System.out.println(ray[5]);				// LINE 5


System.out.println(ray.length);			// LINE 6


System.out.println(boxes.length);			// LINE 7


System.out.println(boxes[0]);				// LINE 8


System.out.println(boxes[1]);				// LINE 9


System.out.println(boxes[2]);				// LINE 10


	}
}