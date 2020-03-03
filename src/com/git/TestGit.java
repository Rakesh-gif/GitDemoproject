package com.git;

public class TestGit {
	public static  void bubbleSort(int []a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int a[]= {10,25,5,12,3};
		bubbleSort(a);
	}

}
