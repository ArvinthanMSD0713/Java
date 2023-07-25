package org.program;
public class Palindromnumber {
	public static void main(String[] args) {
		int a=121;
		int temp=a;
		int r=0;
		while(a>0) {
			int b=a/10;
			int c=a%10;
			r=c+(r*10);
			a=b;
		}
		System.out.println(r);
		if (temp==r) {
			System.out.println("Palindrme No.");
		}
		else {
			System.out.println("Not a Palindrme No.");
		}
	}
}
