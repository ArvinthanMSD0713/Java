package org.program;
public class AscendingandDescendingandMulti {
	public static void main(String[] args) {
		// multiplication
		int b=7, c;
		for (int i=1; i<=10; ++i) {
			 c=b*i;	
			System.out.printf("%d*%d=%d \n", b,i, b*i);
		}
		// ascending and descending
		int [] a= {13, 26, 7, 42, 18};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] +" ");
		}
	}
}
