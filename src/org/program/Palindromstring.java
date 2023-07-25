package org.program;
public class Palindromstring {
	public static void main(String[] args) {
		String j="MoM";
		String a="";
		for(int i=j.length()-1; i>=0 ;i--) {
			a=a+j.charAt(i);
		}
		if(a.equals(j)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
