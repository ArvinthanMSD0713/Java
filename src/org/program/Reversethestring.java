package org.program;
public class Reversethestring {
	public static void main(String[] args) {
		String a="Joshna";
		String j="";
		for(int i=a.length()-1; i>=0; i--) {
			j=j+a.charAt(i);
		}
		System.out.println(j);
	}
}
