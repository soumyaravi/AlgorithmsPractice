package arrays;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = findLength(s);
		if(len>s.length())
			System.out.println(s);
		else
			compressString(s);
	}

	private static void compressString(String s) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		int count = 0;
		
		for(int i=0;i<s.length();i++){
			count ++;
			if((i+1>=s.length()) || s.charAt(i) != s.charAt(i+1)){
				str.append(s.charAt(i));
				str.append(count);
				count = 0;
			}
		}
		System.out.println(str.toString());
	}

	private static int findLength(String s) {
		// find new length before proceeding
		StringBuilder str = new StringBuilder();
		int count = 0;
		
		for(int i=0;i<s.length();i++){
			count ++;
			if((i+1>=s.length()) || s.charAt(i) != s.charAt(i+1)){
				str.append(s.charAt(i));
				str.append(count);
				count = 0;
			}
		}
		return str.toString().length();
	}

}
