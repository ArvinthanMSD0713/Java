package org.program;
public class MiniandMaxi {
	public static void main(String[] args) {
	int [] j= {13, 26, 18, 42, 7};
	for(int i=0; i<j.length; i++) {
		for(int s=i+1; s<j.length; s++) {
			int temp=j[i];
			j[i]=j[s];
			j[s]=temp;
		}
	}
	System.out.println("Maxi No. is : " +j[j.length-4]);
	System.out.println("Mini No, is : " +j[0]);
}
	
}
