package com.codegnan.fundamentals;

public class FrequencyCounter {

	public static void main(String[] args) {
		int[] array = {1,2,3,2,1,4,1,5,1};
		//boolean array to keep track of elements that are already counted
		boolean[] processed = new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			//if the current element is already counted then skip it and move to the next element
			if(processed[i]) {
				continue;
			}
			//initialized frequency count as 1 because the current element itself is counted.
			int count = 1;
			for(int j=i+1;j< array.length;i++) {
				if(array[j] == array[i]) {
					count++;
					processed[j] = true;
				}
			}
			System.out.println(array[i] + " occurs " + count + " times");
		}
	}

}
