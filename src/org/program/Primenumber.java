package org.program;
public class Primenumber {
	public static void main(String[] args) {
		int a=1326;
		int c=0;
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("Prime No.");
		}
		else {
			System.out.println("Not a Prime No." );
		}
	}

}
