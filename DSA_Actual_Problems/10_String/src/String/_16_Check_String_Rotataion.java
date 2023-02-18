/**
* @Developer : Sagar_Pokale
* 25-Jan-2023 6:39:04 AM
**/

package String;
public class _16_Check_String_Rotataion {

	public static void main(String[] args) {

		 String  s1 = "sagar";
		 String s2 = "garsa";
		 
		 System.out.println(areRotation(s1, s2));
	}
	
//	Trick just Concatenate 1 String with himself and then compare with other one 
	
	private static boolean areRotation(String s1, String s2) {
			
		if(s1.length() != s2.length())
			return false;
		
		return ((s1 + s2).indexOf(s2) >= 0);
			
	}

}
