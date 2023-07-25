package org.program;
public class Sum {
	public static void main(String[] args) {
		int a=1326;
		//int r=0;
		int sum=0;
		while(a>0) {
		int b=a/10;
		int c=a%10;
		//r=c+(r*10);
		a=b;
		sum=sum+c;
		}
		//System.out.println(r);
		System.out.println("Sum Of The Nos. are : " +sum);
	}
}
