package orderstatistics;

import java.util.Arrays;

public class SmallestElement {

public static int KthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		
		return arr[k-1];
		
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= new Integer[] {28,16,46,38,55,89,83,30};
		
		int k=4;
		
		System.out.println("4th Smallest Element is : "+ KthSmallest(arr, k) );
	}

}