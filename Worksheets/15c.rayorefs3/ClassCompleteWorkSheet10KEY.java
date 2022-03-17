//(c) A+ Computer Science
//www.apluscompsci.com

//class complete worksheet key  

import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;

public class ClassCompleteWorkSheet10KEY
{
   public static void main(String args[]) throws Exception
   {
		Scanner file = new Scanner(new File("worksheet10.dat"));
		int runCount = file.nextInt();
		Beasts mob = new Beasts(runCount);
		for(int r=1; r<=runCount; r++){
		   mob.set(r-1,new Beast(file.next(), file.nextInt()));
		}
		out.println( mob );
   }
}