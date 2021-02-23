package org.sample;

public class Ascending {
	public static void main(String[] args) {
		int [] a= {10,11,5,6,20,30,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int tem=a[i];
					a[i]=a[j];
					a[j]=tem;
					
				}
				
			}
			
		}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[2]);
		break;
	}
}
}