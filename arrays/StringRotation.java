package arrays;


public class StringRotation {


	private static void rotateString(String s1, String s2) {
		if(s1.length()==s2.length() && s1.length()!=0 && s2.length()!=0){
		String s1s1 = s1+s1;
		if(isSubstring(s2,s1s1))
			System.out.println("Yes");
		else
			System.out.println("No");
		}
		
	}

	private static boolean isSubstring(String s2, String s1s1) {
		// TODO Auto-generated method stub
		return true;
	}

}
