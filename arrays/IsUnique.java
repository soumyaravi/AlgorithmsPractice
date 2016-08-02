package arrays;

import java.util.HashMap;
public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Soumya Rvi ";
		System.out.println(checkUnique(str));
	}

	private static boolean checkUnique(String str) {
		// TODO Auto-generated method stub
		if(str.length()>128) //assuming ASCII set
			return false;
		else{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>(128);
			for(int i=0;i<str.length();i++){
				if(map.containsKey(str.charAt(i)))
					return false;
				else
					map.put(str.charAt(i), 1);
			}
			return true;
		}
	}

}
