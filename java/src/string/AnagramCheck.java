package string;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
       anagram();
	}
	//checking given two string is anagram are not
	public static void anagram() {
		String a="race";
		String b="care";
		
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		System.out.println(a1);
		System.out.println(b1);
		
		if(Arrays.equals(a1,b1)) {
			System.out.println("Yes,Given Strings are Anagram");
		}
		else {
			System.out.println("no,Given Strings are not a Anagram");
		}
	}
}
