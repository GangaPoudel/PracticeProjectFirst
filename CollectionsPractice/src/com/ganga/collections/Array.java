package com.ganga.collections;

public class Array {
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 12;
		array[2] = 14;
		array[3] = 15;
		
		System.out.println(array.length);
		
		for(int i = 0; i< array.length-1;i++) {
			System.out.println(array[i]);
		}
		for( int result:array) {
			System.out.println(result);
		}
		
	}

}
