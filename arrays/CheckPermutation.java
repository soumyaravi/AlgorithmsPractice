package arrays;

import java.util.HashMap;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Babey";
		String str2 = "yBaya";
		System.out.println(findPermutation(str1,str2));
	}

	private static boolean findPermutation(String str1, String str2) { // method1
		// TODO Auto-generated method stub
		if(str1.length()!=str2.length())
			return false;
		else{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0;i<str1.length();i++){
				int temp=0;
				if(map.containsKey(str1.charAt(i)))
					temp = map.get(str1.charAt(i));
				map.put(str1.charAt(i), temp+1);
			}
				System.out.println(map.keySet());
				
			for(int i=0;i<str2.length();i++){
				if(!map.containsKey(str2.charAt(i)))
					return false;
				else if(map.get(str2.charAt(i))==null)
					return false;
				else
					map.put(str2.charAt(i),map.get(str2.charAt(i)-1));
			}
			return true;
		}
		
	}

}
