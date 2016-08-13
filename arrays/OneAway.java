package arrays;

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
			System.out.println("No");
	}

	private static void checkEdit(String s1, String s2) {
		// TODO Auto-generated method stub
		int diff = Math.abs(s1.length()-s2.length());
		if(diff==0)
			zeroedit(s1,s2);
		else{
				if(s1.length()<s2.length())
					System.out.println(oneedit(s1,s2));
				else
					System.out.println(oneedit(s2,s1));
		}
	}

	private static boolean oneedit(String s1, String s2) {
		// For insertion and removal
		int index1=0,index2=0;
		boolean flag = false;
		while(index1<s1.length() && index2<s2.length()){
			if(s1.charAt(index1) != s2.charAt(index2)){
				if(flag)
					return false;
				else
					flag = true;
			}
			else
				index1++;	//increment index of shorter string
			index2++;	//increment index of longer string
		}
		return true;
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
