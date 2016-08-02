package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		checkPermutation(s);
	}

	private static void checkPermutation(String s) {
		// TODO Auto-generated method stub
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		int len = ch.length;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' ')
				len--;
			else if(map.containsKey(ch[i])){
				int val = map.get(ch[i])+1;
				map.remove(ch[i]);
				map.put(ch[i], val);
			}
			else
				map.put(ch[i], 1);
		}
		Iterator<Character> set = map.keySet().iterator();
		int odd=0;
		while(set.hasNext()){
			if(map.get(set.next())%2!=0)
				odd++;
		}
		if((len%2==0 && odd==0) || (len%2==1 && odd==1))
			System.out.println("true");
		else 
			System.out.println("False");
			
	}

}
