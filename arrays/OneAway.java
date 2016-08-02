package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(Math.abs(s1.length()-s2.length())<=1)
			checkEdit(s1,s2);
		else
			System.out.println("False");
	}

	private static void checkEdit(String s1, String s2) {
		// TODO Auto-generated method stub
		int diff = Math.abs(s1.length()-s2.length());
		if(diff==0)
			zeroedit(s1,s2);
		else{
				oneedit(s1,s2);
		}
	}

	private static void oneedit(String s1, String s2) {
		// For insertion and removal
		int flag=0;
		int count[]=new int[128]; // assuming ascci set
		for(int i=0;i<s1.length();i++){
			count[(s1.charAt(i))]++;
		}
		for(int i=0;i<s2.length();i++){
			count[(s2.charAt(i))]++;
		}
		for(int i=0;i<count.length;i++){
			if(count[i]%2==1)
				flag++;
			System.out.println(i+" " + flag);
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("Yes");
	}

	private static void zeroedit(String s1, String s2) {
		// Either they are same or for replacement
		if(s1.equals(s2))
			System.out.println("Yes");
		else{
			boolean diff = false;
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)!= s2.charAt(i)){
					if(diff){
						diff = false;
						System.out.println("No");
						break;
					}
					else
					diff = true;
				}
			}
			if(diff)
			System.out.println("Yes");
		}
	}

}
