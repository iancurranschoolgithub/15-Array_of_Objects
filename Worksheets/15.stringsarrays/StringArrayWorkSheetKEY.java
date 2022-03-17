//© A+ Computer Science
//www.apluscompsci.com

//string array worksheet key    

public class StringArrayWorkSheetKEY
{
	public static void main(String[] args)
	{
		String[] ray = {"cba","jkl","789","lof","asd","bgt","pig"};
				
		System.out.println(ray[0]);				
		
		
		System.out.println(ray[0].charAt(0));		
		
		
		System.out.println(ray[6]);				
		
		
		System.out.println(ray[1]);				
		
		
		System.out.println(ray.length);			
		
		
		ray = "two two three five five six eight eight".split(" ");
		
		System.out.println(ray[0]);				
		
		
		System.out.println(ray[3/2].charAt(0));		
		
		
		System.out.println(ray[7/2]);				
		
		
		System.out.println(ray[1]);			
		
		
		System.out.println(ray.length);			
				
		ray = "def-527-158-926".split("\\-");
		
		System.out.println(ray[0]);				
		
		
		System.out.println(ray[3*1]);			
		
		
		System.out.println(ray[2].replaceAll("[46]","#"));
		
		
		System.out.println(ray[1]);
	}
}