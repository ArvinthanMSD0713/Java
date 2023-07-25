package org.program;
public class Reversenumber {
	public static void main(String[] args) {
		int a=123;
		int r=0;
		while(a>0) {
			int b=a/10;
			int c=a%10;
			r=c+(r*10);
			a=b;
		}
		System.out.println(r);
	}
}
