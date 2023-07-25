package org.program;
public class Countnumber {
	public static void main(String[] args) {
		int a=111;
		int r=0;
		int count=0;
		while(a>0) {
			int b=a/10;
			int c=a%10;
			r=c+(r*10);
			a=b;
			count++;
		}
		System.out.println(r);
		System.out.println("No.Of digits are : " +count);
	}

}
