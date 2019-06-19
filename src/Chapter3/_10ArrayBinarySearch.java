package Chapter3;

import java.util.Arrays;

public class _10ArrayBinarySearch {

	public static void main(String[] args) {
		//array should sorted first
		//Target element found in sorted array--->Index of match
		//Target element not found in sorted array
		//	--->Negative value showing one smaller than the negative of index
		//Unsorted array--->A surprise—this result isn’t predictable
		
		int[] numbers = {2,4,6,8};// have to sorted
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers, -2)); //-1
	}

}
